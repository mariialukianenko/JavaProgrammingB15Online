package day00Traning;
import java.util.Scanner;
public class Repl128 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = 0;
        double total = 0;
        double avgTemp = 0;
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

        for (int i = 0; i <= temps.length-1; i++) {
            total = total + temps[i];
            k++;
        }
        avgTemp = total / k;
        System.out.println(avgTemp);
    }
}
