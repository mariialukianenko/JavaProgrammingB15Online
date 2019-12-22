package day18;

public class DoWhileIntro {
    public static void main(String[] args) {

        int x = 1;
        do {
            System.out.println(x);
            ++x;
        }while (x<=10);

        System.out.println();
        // count from 5 to 1
        int y = 5;
        do {
            System.out.println(y);
            --y;
        }while (y>=1);

    }
}
