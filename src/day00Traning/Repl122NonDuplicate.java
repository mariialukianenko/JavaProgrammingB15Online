package day00Traning;
import java.util.Arrays;
import java.util.Scanner;
public class Repl122NonDuplicate {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i <=nums.length-1 ; i++) {


                if(i!=nums.length-1 && nums[i]==nums[i+1]){
                    i++;
                }else{
                    System.out.println(nums[i]);
                }
            }

        }

    }


