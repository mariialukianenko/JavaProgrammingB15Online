package day00Traning;
import java.util.Scanner;
public class FindJavaPhyntonRepl {
    public static void main(String[] args) {

//        int countOfJava = 0;
//        for (int x =0; x <= word.length()-4; x++){
//            if (word.substring(x, x+4).equals("java")){
//                countOfJava++;
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        int countJava = 0;
        int countPython = 0;

        for (int x = 0; x <=sentence.length()-4 ; x++) {
            if (sentence.substring(x, x + 4).equals("java")) {
                countJava = countJava + 1;
            }
        }
        for (int y = 0; y <=sentence.length()-6 ; y++) {
            if (sentence.substring(y, y + 6).equals("python")) {
                countPython = countPython + 1;
            }
        }
        System.out.println(countJava==countPython);

     }
        }



