package day00Traning;
import java.util.Arrays;
import java.util.Scanner;
public class Repl122NonDuplicate_version2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        for (int i = 0; i <= nums.length-1; i++) {
            int equalCount = 0;
            for (int k = 0; k <= nums.length-1; k++) {
                if (nums[i] == nums[k]) {
                    equalCount++;
                }
            }
            if (equalCount == 1) {
                System.out.println(nums[i]);
                break;
            }
        }

        }

    }


