package day35;

public class CharacterPractice2 {
    public static void main(String[] args) {

        String str = "A34B123C4X";

//        int sum = 0;
//
//        for (int i = 0; i <= str.length()-1 ; i++) {
//            if (Character.isDigit(str.charAt(i))){
//                sum = sum + Integer.parseInt(String.valueOf(str.charAt(i)));
//            }
//        }
//        System.out.println(sum);

        char[] allChars = str.toCharArray();

        int sum = 0;

        for (char  eachChar : allChars){

            if (Character.isDigit(eachChar)) {
                System.out.println(eachChar);
                sum = sum + Integer.parseInt(eachChar+"");
            }
        }
        System.out.println(sum);

    }
}
