package day00Traning;
import java.util.Scanner;
public class PrintVowelsRepl {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below

        for (int x = 0; x<=word.length()-1; x++){
            if (word.charAt(x)=='a' || word.charAt(x)=='e'||
                    word.charAt(x)=='i'|| word.charAt(x)=='o'|| word.charAt(x)=='u'){
                System.out.print(word.charAt(x));
            }
        }
    }
}
