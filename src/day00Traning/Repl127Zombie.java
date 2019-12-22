package day00Traning;
import java.util.Arrays;
import java.util.Scanner;
public class Repl127Zombie {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        int day = 0;
         int sum;
        do {
            sum = 0;
            System.out.print("Day "+ day +" " + Arrays.toString(inhabitants));
            day++;
            for (int x = 0; x <= inhabitants.length - 1; x++) {
                if (inhabitants[x] > 0) {
                    inhabitants[x] = inhabitants[x] / 2;
                    sum = sum +inhabitants[x];
                }
            }
            System.out.println();
        }while (sum > 0);

        System.out.println("Day "+ day +" " + Arrays.toString(inhabitants));
        System.out.println("---- EXTINCT ----");


    }
}
