package day26;

public class SplitPractice {
    public static void main(String[] args) {

        // toCharArray()  ,   another split by (something)
        String sentence = "Mariia Lukianenko B15 Online student";
        char [] charSentence = sentence.toCharArray();

        for ( char eachChar :  charSentence) {
            System.out.println(eachChar);
        }
            // while loop
            System.out.println("=============");
            int x = 0;
            while (x <= charSentence.length-1){
                System.out.println(charSentence[x]);
                x++;
        }

            // do while
        System.out.println("=====================");
        int y = 0;
        do {
            System.out.println(charSentence[y]);
            y++;
        }while (y <= charSentence.length-1);


    }
}
