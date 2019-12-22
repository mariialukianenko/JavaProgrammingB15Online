package day29;

import java.util.Arrays;

public class FillingUpArrayValueEvenNumber {
    public static void main(String[] args) {

        // even number including zero
        int [] numbers = new int[100];

//        numbers[0] = 0; // 0*2
//        numbers[1] = 2; // 1*2
//        numbers[2] = 4; // 2*2
//        numbers[3] = 6; // 3*2    ......

        // numbers[x] = x * 2

        for (int i = 0; i <= numbers.length-1 ; i++) {
            numbers[i] = i * 2;    //// numbers[i] = (i * 2)+1;   this is for odd numbers
        }
        System.out.println(Arrays.toString(numbers));


    }
}
