package day24;

public class WarmUpLongestWorld {
    public static void main(String[] args) {

        String [] word = {"Mariia", "Illia", "Alexandr" };

        String   maxLength = word[0];

        for ( String name  :   word   ){
            if (maxLength.length() < name.length()){
                maxLength = name;
            }
        }
        System.out.println("Longest word is: "+maxLength);
    }
}
