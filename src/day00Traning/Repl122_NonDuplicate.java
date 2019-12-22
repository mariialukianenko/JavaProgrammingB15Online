package day00Traning;

public class Repl122_NonDuplicate {
    public static void main(String[] args) {

        int [] nums = {1, 1, 2, 3, 4, 3, 4};
        int count = 0;
        for (int i : nums){
            for (int j : nums){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if (count<2){
                System.out.println(nums[i]);
                break;
            }
            count = 0;
        }
    }
}
