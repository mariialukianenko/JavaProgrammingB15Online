package day21;

public class Searching2LetterInStringAndCount {
    public static void main(String[] args) {
        String myName = "Mariia Lukianenko";


        //find out index of all the letter ma in cases insensetive manner
        int count = 0;
        for (int x =0; x <=myName.length()-2; x++) {

            if (myName.substring(x, x + 2).equalsIgnoreCase("ia")) {
                count = count+1;  // or ++count;
                System.out.println("The index of a or Ia is: " + x);
                System.out.println(myName.substring(x, x+2));

            }
        }
        System.out.println(count);
    }
}
