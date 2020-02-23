package day63;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyMethod {

    public static void main(String[] args) {


        String str = "Fun Fun Fun Java Java is Ending Tomorrow Tomorrow No It is never Ending";

        System.out.println("getFrequencyMap(str) = " + getFrequencyMap(str));

    }


    // WHY THIS IS STATIC ? SO I CAN CALL IT DIRECTLY IN MAIN TO TEST
    // CAN I NOT MAKE IT STATIC ? YES YOU CAN , THEN YOU WILL HAVE TO CREATE OBJECT THEN CALL IT
    // CAN IT BE VOID ? YES YOU CAN USE VOID IF THAT'S WHAT YOU WANT
    // BUT HERE REQUIREMENT IS getFrequencyMap AND RETURN IT TO THE CALLER ,

    public static Map<String, Integer> getFrequencyMap(String str) {

        Map<String, Integer> wordFreqMap = new HashMap<>();
        String[] allWords = str.split(" ");

        for (String word : allWords) {
            if (!wordFreqMap.containsKey(word)) {
                wordFreqMap.put(word, 1);
            } else {
                wordFreqMap.replace(word, wordFreqMap.get(word) + 1);
            }
        }
        return wordFreqMap;
    }


}