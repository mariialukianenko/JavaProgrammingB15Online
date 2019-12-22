package day00Traning;

import java.util.Arrays;

public class Mentoring_SwapElement_Sort {
        public static void main(String[] args) {

            // swap elements
            int[] nums = {2, 4, 1, 34, 8};

            for (int i = 0; i <= nums.length-1 ; i++) {
                for (int j = i+1; j <= nums.length-1; j++){
                    if (nums[i] > nums[j]){    // < find from max , > find from min
                        int temp=nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                }

            }
            System.out.println(Arrays.toString(nums));

        }
    }

