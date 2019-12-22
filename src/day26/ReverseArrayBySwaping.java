package day26;

import java.util.Arrays;

public class ReverseArrayBySwaping {
    public static void main(String[] args) {

        int [] myNumbers = new int[] {5, 3, 21, 2, 1, 13, 8};
        System.out.println(Arrays.toString(myNumbers));

        // first and last
        System.out.println(myNumbers[0]+" "+myNumbers[myNumbers.length-1]);
        System.out.println(myNumbers[1]+" "+myNumbers[myNumbers.length-1-1]);
        System.out.println(myNumbers[2]+" "+myNumbers[myNumbers.length-1-1-1]);

        for (int x = 0; x <=myNumbers.length/2 ; x++) {
            int temp = myNumbers[x];
            myNumbers[x] = myNumbers[myNumbers.length-1-x];
            myNumbers[myNumbers.length-1-x] = temp;
        }
        System.out.println(Arrays.toString(myNumbers));

    }
}
