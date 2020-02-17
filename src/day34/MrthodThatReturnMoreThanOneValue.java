package day34;

import java.util.Arrays;

public class MrthodThatReturnMoreThanOneValue {
    public static void main(String[] args) {

        String sentence = "I love Java";

        char[] eachChars = sentence.toCharArray();
        String[] eachWords = sentence.split(" ");

        int[] resultArr = returnBoysVSGirlsResult();
        System.out.println(Arrays.toString(resultArr));
    }

    public static int[] returnBoysVSGirlsResult(){
        int[] boysVSGirlsCount = {57,52};
        return boysVSGirlsCount;
    }
}
