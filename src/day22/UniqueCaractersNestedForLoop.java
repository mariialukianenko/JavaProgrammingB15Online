package day22;

public class UniqueCaractersNestedForLoop {
    public static void main(String[] args) {

        String word = "aaabbbbcccddaddcc";
        String unique = "";

        for (int x = 0; x <=word.length()-1 ; x++) {
                if (!unique.contains(word.substring(x,x+1))){
                unique = unique + word.charAt(x);
            }
            }
        System.out.println(unique);
        }

}
