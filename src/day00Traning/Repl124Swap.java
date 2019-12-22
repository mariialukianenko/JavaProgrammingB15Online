package day00Traning;
import java.util.Scanner;
import java.util.Arrays;
public class Repl124Swap {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below

        for (int i = 0, j = nums.length-1 ; i <=(nums.length/2)-1; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }



        //Do not change below statement:
        System.out.println(Arrays.toString(nums));
    }
}
