package day20;
import java.util.Scanner;
public class CountJavaRepl98 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        String word = scan.next();

        int countOfJava = 0;
       for (int x =0; x <= word.length()-4; x++){
           if (word.substring(x, x+4).equals("java")){
               countOfJava++;
           }
       }
        System.out.println(countOfJava);

    }
}
