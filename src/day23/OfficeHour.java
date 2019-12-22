package day23;

import java.util.Arrays;

public class OfficeHour {
    public static void main(String[] args) {

        int[] nums = new int[3];
        nums[0] = 5;
        nums[1] = 7;
        nums[2] = 9;

        System.out.println(Arrays.toString(nums));
        System.out.println(nums.length);

        System.out.println("Last value in array: "+nums[nums.length-1]);
        System.out.println("middle method: "+nums[nums.length/2]);

        int[] newNums = new int[] {1, 3, 4, 5, 7};
        System.out.println(newNums[newNums.length/2]);
        int max = newNums[0];

        for (int index = 0; index <=newNums.length-1 ; index++) {
            if ( newNums[index] > max ){
                max = newNums[index];
            }
        }
        System.out.println("Max is: "+max);

    }
}
