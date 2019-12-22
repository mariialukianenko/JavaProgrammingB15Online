package day20;

public class FindDogInSentence {
    public static void main(String[] args) {

        String msg = " I like dogs";
        int lastCharIndex = msg.length()-1;
        System.out.println(lastCharIndex);

        for (int i = 0; i<=lastCharIndex-2; i++){
            String current3char = msg.substring(i, i+3);
            System.out.println(i+ " : "+ current3char);
            
            if (current3char.equals("dog")){
                System.out.println("Bingo!!! At "+i);
            }

        }
    }
}
