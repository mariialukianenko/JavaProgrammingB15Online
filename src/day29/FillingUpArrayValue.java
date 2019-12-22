package day29;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FillingUpArrayValue {
    public static void main(String[] args) {

        // create an array with size 100 and fill it up as below

        int [] numbers = new int[100];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int x = 0; x <= numbers.length-1 ; x++) {
            numbers[x] = x + 1;
        }
        System.out.println(Arrays.toString(numbers));

    }
}
