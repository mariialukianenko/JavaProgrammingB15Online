package day00Traning;
import java.util.Scanner;
public class ReplFindMaxNumberInArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        // yes above code will ask user 5 numbers while creating an array
        // just assume that you have int array with 5 numbers and start working on requirement
        // loop through the array and find the max number.


        int max = nums[0];
        for (int i = 0; i <= nums.length-1 ; i++) {
            if (nums[i]>max){
                max = nums[i];
            }
        }
        System.out.println(max);
    }
}