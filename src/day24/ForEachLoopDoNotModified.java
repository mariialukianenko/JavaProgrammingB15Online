package day24;

public class ForEachLoopDoNotModified {
    public static void main(String[] args) {
        long[] nums = {10, 40, 20};
   //      nums[0] = nums[0] * 2;
  //       System.out.println("nums[0] = " + nums[0]);


        for (int x = 0; x < 3; x++){
            long eachItem = nums[x];
            eachItem = 100;
            //System.out.println("eachItem = " + eachItem);

            //nums[x] = nums[x] *2;
        }

        System.out.println("=============");

        for (int x = 0; x < 3; x++) {
            System.out.println(nums[x]);
        }

        // never use for each loop to modify array items    DO NOT DO IT
    }
}
