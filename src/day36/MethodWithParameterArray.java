package day36;

import java.util.Arrays;

public class MethodWithParameterArray {
    public static void main(String[] args) {

        int [] nums = {1, 5, 3, 4, 7, 2};

        System.out.println("Before sort "+ Arrays.toString(nums));

        Arrays.sort(nums);
        System.out.println("After sort "+ Arrays.toString(nums));

        System.out.println();
        changeArrayFirstTo100(nums);
        System.out.println(Arrays.toString(nums));

        // when you pass a variable to a method parameter
        // you are only passing the copy of that variable
        // for primitives --> the copy hold the value itself
        // changing the value does not change original value that passed
    }

    public static void changeArrayFirstTo100(int[] numbers){

        numbers[0] = 100;

    }
}
