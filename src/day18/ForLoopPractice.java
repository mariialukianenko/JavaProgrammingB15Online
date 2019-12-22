package day18;

public class ForLoopPractice {
    public static void main(String[] args) {

        for (int x = 0; x < 100; x += 2) {
            System.out.print(x + " ");
        }

        System.out.println();
        for (int y = 0; y < 100; y += 3) {
            System.out.print(y + " ");
        }
        System.out.println();

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

            System.out.println();

            for (int j = 0; j < 100; j++) {
                if (j % 5 == 0 && j % 3 == 0) {
                    System.out.println(j + " fizz buzz number");
                }
            }

        




    }
}



