package day21;

public class LoopControlStatementContinue {
    public static void main(String[] args) {

        // continue
        // if line contains continue reaches, the loop will skip to next iteration!!!

        // we can use them for any loop

        for (int x = 1; x <= 10; x++) {
            if (x%2!=0) {           // or x%2==1 the same
           continue;
            }
            System.out.println(x);
        }

        System.out.println();
        for (int y = 1; y <= 100; y++) {
            if (y%5!=0) {
                continue;
            }
            System.out.println(y);
        }
    }
}
