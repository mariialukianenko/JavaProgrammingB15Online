package day00Traning;

public class OfficeHour_12_12 {
    public static void main(String[] args) {

        int[] nums = {1, 1, 7, 7, 3};

        int count = 0;
        for (int i = 0; i <= nums.length-1 ; i++) {
            for (int j = 0; j <= nums.length-1 ; j++) {
                if (nums[i]==nums[j]){
                    count++;
                }
            }
            if (count<2){
                System.out.println(nums[i]);
            }
            count = 0;
        }

        System.out.println("=============================");

        char[] letter = {'A', 'B', 'A', 'C', 'C'};

        int countLetter = 0;
        for (int i = 0; i <= letter.length-1 ; i++) {
            for (int j = 0; j <= letter.length-1 ; j++) {
                if (letter[i]==letter[j]){
                    count++;
                }
            }
            if (count<2){
                System.out.println(letter[i]);
            }
            count =0;
        }

        System.out.println("=============================");

        int[] numbers = {1, 2, 3, 4, 5};
        int max = numbers[0];
        for (int x = 0; x <= numbers.length-1 ; x++) {
            if (numbers[x]>max){
                max = numbers[x];
            }
        }
        System.out.println("First max number = "+max);

        int max2 = numbers[0];
        for (int x = 0; x <= numbers.length-1 ; x++) {
            if (numbers[x] > max2 && numbers[x]!= max) {
                max2 = numbers[x];
            }
        }
        System.out.println("Second max number = "+max2);

        System.out.println("=============================");

        int a = 20;
        int b = 10;

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = "+ a+". b = "+b);

        // without using temporary

        int c = 30;
        int d = 40;

        c = c + d; // 70
        d = c - d;  // 30
        c = c - d;  // 40
        System.out.println("c = "+ c+". d = "+d);



    }
}
