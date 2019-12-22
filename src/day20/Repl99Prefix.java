package day20;
import java.util.Scanner;
public class Repl99Prefix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();

        String prefix = str.substring(0,n);
        int countPrefix = 0;

        for ( int x = 0; x<=str.length()-n; x++ ){
            if (str.substring(x, x+n).equals(prefix)){
                countPrefix++;
            }
        }
        System.out.println(countPrefix);
        System.out.println(countPrefix==n);
    }
}
