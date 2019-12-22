package day16;

public class SecondWordGetter {
    public static void main(String[] args) {

        // given a sentence with 3 words
        // get the second word

        String sentence = "I love java";
        String secondWord;
        int firstSpaceIndex = sentence.indexOf(" ");
        System.out.println("firstSpaceIndex = " + firstSpaceIndex);

        int lastSpaceIndex = sentence.lastIndexOf(" ");
        System.out.println("lastSpaceIndex = " + lastSpaceIndex);

        System.out.println( sentence.substring(2,6));

        secondWord = sentence.substring( firstSpaceIndex+1, lastSpaceIndex );
        System.out.println("second word = " + secondWord);





    }
}
