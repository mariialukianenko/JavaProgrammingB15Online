package day21;

public class LoopControlStatemeant {
    public static void main(String[] args) {

        // break
        // if line contains break reaches, the loop will stop!!!

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            break;
        }

        System.out.println();
        // break out at 5
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i==5){
                break;
            }
        }
        System.out.println();

        int sum = 0;
        for (int x = 1; x <= 10 ; x++) {

            System.out.println("Current sum is: "+ sum);
            System.out.println("if I add "+ x+ "dollar, it would be "+(sum+x));

            if (sum+x > 12) {
                break;
            }
                sum = sum+x;
        }
        System.out.println("Sum of numbers = "+sum);


        // continue
        // if line contains continue reaches, the loop will skip to next iteration!!!

        // we can use them for any loop
    }
}
