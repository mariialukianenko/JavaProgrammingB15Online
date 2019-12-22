package day26;

import java.util.Arrays;

public class WarmUp {
    public static void main(String[] args) {

        // Array is an object that can hold miltiple items, element of the same time.

        int [] nums = {10, 40, 30, 7};

        nums[2] = nums[0] + nums[1];
        System.out.println(nums[2]);

        int temp = nums[0];
        nums[0] = nums[nums.length-1];
        nums[nums.length-1] = temp;
        System.out.println(nums[0]+" and "+ nums[nums.length-1]);


        String [] name = {"mariia", "illia"};
        String temperary = name[0];
        name[0] = name[1];
        name[1] = temperary;
        System.out.println(Arrays.toString(name));

        int [] numbers = {10, 20, 30, 7};
        int temper = numbers[0+1];
        numbers[0+1] = numbers[numbers.length-2];
        numbers[numbers.length-2] = temper;
        System.out.println(Arrays.toString(numbers));



    }
}
