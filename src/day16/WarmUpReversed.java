package day16;

public class WarmUpReversed {
    public static void main(String[] args) {

        String word1 = "love";
        String word2 = "" + word1.charAt(3)+word1.charAt(2) + word1.charAt(1) +word1.charAt(0);
        System.out.println(word2);
        // we should add empty "", becouse it is should be word, not a number.
        System.out.println("" + word1.charAt(3) +  word1.charAt(2) + word1.charAt(1)+
                word1.charAt(0));

        // another method



    }
}
