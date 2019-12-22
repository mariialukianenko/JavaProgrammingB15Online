package day21;

public class BreakAndContinue {
    public static void main(String[] args) {

        for (int x = 1; x <= 5; x++) {
            System.out.println(x);

            if (x == 5){
                break;
            }
            continue;
            ///// pointless
        }
    }
}
