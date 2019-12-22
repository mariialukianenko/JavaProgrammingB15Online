package day19;

public class SumOfAllNumberWithinTheRange {
    public static void main(String[] args) {
        // get the sum of numbers from 1 - 10
        // when we loop from 1 to 10
        int sum = 0;

//        sum = sum + 1     //1
//        sum = sum + 2     //3
//        sum = sum + 3     //6
//        sum = sum + 4     //10
//        sum = sum + 5     //15...

        // sum = sum + i

        for (int i = 0; i <= 10 ; i++) {
      //      System.out.println(i);
            sum = sum + i;
            System.out.print(sum+" ");

        }
        System.out.println();
        System.out.println(sum);
    }
}
