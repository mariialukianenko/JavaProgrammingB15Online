package day20;
import java.util.Scanner;
public class PrintLettersRepl95 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char start = scan.next().charAt(0);
        char end = scan.next().charAt(0);

        for (char i = start; i <= end ; i++) {
            System.out.println(i);
        }

    }
}
