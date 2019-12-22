package day20;
import java.util.Scanner;
public class CountHi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String newStr = str.replace(" ", "");
        int countOfHi = 0;

        for (int x = 0; x<=newStr.length()-2; x++){
            if (newStr.substring(x, x+2).equals("hi")){
                countOfHi++;
            }
        }
        System.out.println(countOfHi);

    }
}
