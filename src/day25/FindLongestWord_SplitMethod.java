package day25;

public class FindLongestWord_SplitMethod {
    public static void main(String[] args) {

        String sentence = "We are trying to fing longest word";
        String[] arr = sentence.split(" ");

        String longestWord = arr[0];

        for ( String  eachWord  :  arr    ){
            if (longestWord.length() < eachWord.length()){
                longestWord = eachWord;
            }
        }
        System.out.println(longestWord);

        }

    }

