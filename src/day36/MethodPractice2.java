package day36;

import java.util.Arrays;

public class MethodPractice2 {
    public static void main(String[] args) {

        long [] myLong = {6L, 45L, 32L, 24L};

        swapFirstAndLastValue(myLong);
        System.out.println(Arrays.toString(myLong));

    }
    // swap first and last value
    public static void swapFirstAndLastValue (long [] nums){

       long temp = nums[0];
       nums[0] = nums[nums.length-1];
        nums[nums.length-1] = temp;

    }
}
