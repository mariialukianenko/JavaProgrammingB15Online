package day21;

public class NestedLoopIntro {
    public static void main(String[] args) {

        // count from 1 to 5
        // repeat this 3 times

        for (int x = 1; x <= 3 ; x++) {
            System.out.println("iteration: "+ x);

            for (int i = 1; i <= 5 ; i++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

        System.out.println("----------");
        // count 1 to 10
        // print odd number
        // repeat 4 times

        for (int y = 1; y <= 4 ; y++) {

            for (int z = 1; z <=10 ; z++) {
                if (z%2!=0){
                    System.out.print(z+", ");
                }

            }

            System.out.println();
        }

    }
}
