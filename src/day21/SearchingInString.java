package day21;

public class SearchingInString {
    public static void main(String[] args) {

        String myName = "Mariia Lukianenko";

        int charCount = myName.length();
        int lastCharIndex = charCount -1;

        //find out index of all the letter a in cases insensetive manner

        for (int x =0; x <=lastCharIndex; x++) {

            String currentChar = myName.substring(x, x + 1);
            if (currentChar.equalsIgnoreCase("a")) {
                System.out.println("The index of a or A is: " + x);

            }
        }
    }
}
