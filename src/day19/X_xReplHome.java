package day19;
import java.util.Scanner;
public class X_xReplHome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();


       if (word.indexOf("x")==0 || word.indexOf("X")==0){
            word = word.substring(1);
        }else if (word.indexOf("x")==word.length()-1 || word.indexOf("X")==word.length()-1){
           word = word.substring(0, word.length()-1);
        } else if (word.indexOf("x")==0  || word.indexOf("x")==word.length()-1) {
           word = word.substring(1, word.length() - 1);
       }

        System.out.println(word);


    }
}
