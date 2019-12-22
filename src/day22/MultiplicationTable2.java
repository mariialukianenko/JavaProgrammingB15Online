package day22;


public class MultiplicationTable2 {
    public static void main(String[] args) {

        for (int x = 1; x <= 12; x++) {
            for (int y = 1; y <= 12; y++) {
                System.out.println(x + "*" + y + "=" + y * x);
            }
            System.out.println();
        }

    }
}
