package day26;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {

        String sentence = "Mariia Lukianenko B15 Online student";
        char [] charSentence = sentence.toCharArray();

        Arrays.sort(charSentence);
        System.out.println(Arrays.toString(charSentence));
    }
}
