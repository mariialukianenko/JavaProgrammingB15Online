package day33;

public class OfficeHour {
    public static void main(String[] args) {

        String word = "computer";

        System.out.println(reverseString(word));
    }

    public static String reverseString (String str){
       String reversedStr = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reversedStr = reversedStr + str.charAt(i);
        }
        return reversedStr;
    }
}
