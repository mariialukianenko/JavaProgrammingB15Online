package day35;

public class CharacterPractice {
    public static void main(String[] args) {

        // Character class has lots of static methods
        // to perform actions on char values

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit(' '));
        System.out.println(Character.isDigit('6'));

        String str = "A34B123C4X";
        // get the number out of this String

        String numsInString = "";

        for (int i = 0; i <= str.length()-1 ; i++) {

            if (Character.isDigit(str.charAt(i))){
                System.out.println(str.charAt(i));
                numsInString = numsInString + str.charAt(i);
            }
        }
        System.out.println("String - " +numsInString);

            Integer num = Integer.valueOf(numsInString);
        System.out.println("Integer - "+num);

        // get sum of the numbers inside a string
        // optionally make it a method


        }

    }

