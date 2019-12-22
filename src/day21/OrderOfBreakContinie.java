package day21;

public class OrderOfBreakContinie {
    public static void main(String[] args) {

        for (int x = 1; x <=10 ; x++) {
            break;

            // unreachable code, will not work
            // System.out.println("hello");

        }
        System.out.println("the end");
    }
}
