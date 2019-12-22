package day25;

import java.util.Arrays;

public class String_Split_Method {
    public static void main(String[] args) {

        String sentence = "I love Java";
       String[] allword =  sentence.split(" ");
        System.out.println(Arrays.toString(allword));

        System.out.println("how many word do I have? "+ allword.length);

        // how to get the last word
        System.out.println("last word in the sentence: "+ allword[allword.length-1]);

        String sentence2 = "Everything is awesome!!!";
        String[] allword2 =  sentence2.split("e");
        System.out.println(Arrays.toString(allword2));
        for (String eachPieces  :  allword2){
            System.out.println(eachPieces);
        }

        System.out.println("=========");
        String[] splitIs = sentence2.split("is");
        System.out.println(Arrays.toString(splitIs));
    }
}
