package day21;

public class LoopNameBreaker {
    public static void main(String[] args) {

        String name = "Mariia";

        for (char x = 0; x <=name.length()-1 ; x++) {

            if (name.charAt(x)=='r' || name.charAt(x)=='R'){  // case insensetive with char
                break;                                        // we can't use ignore with char
            }
            System.out.print(name.charAt(x)+" ");

        }

    }
}
