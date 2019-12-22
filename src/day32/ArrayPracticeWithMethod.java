package day32;

import java.util.Arrays;

public class ArrayPracticeWithMethod {
    public static void main(String[] args) {

        printArrayItems( new int[] {5, 6, 7, 8, 9} );

        int [] scores = {2, 5, 8, 33, 4};
        printArrayItems(scores);

        printMaxOfIntArray(new int[] {1, 3, 8, 5, 3});

        printSumOfIntArray(new int [] {1, 4, 5, 5, 5});


    }

    public static void printArrayItems ( int[] nums ){
        System.out.println("arrays has items : "+ Arrays.toString(nums));
    }

    public static void printMaxOfIntArray( int [] numbers){

        int max = 0;
        for (int i = 0; i <=numbers.length-1 ; i++) {
            if (max<numbers[i]){
                max = numbers[i];
            }

        }
        System.out.println("Maximum number in array = "+max);
    }

    public static void printSumOfIntArray (int[] numsArr){
        int sum = 0;
        for (int j = 0; j <=numsArr.length-1 ; j++) {
            sum = sum+numsArr[j];
        }
        System.out.println("Sum = "+sum);
    }

    //public static void
}
