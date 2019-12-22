package day21;

public class LoopNameBreakerWithSubstring {
    public static void main(String[] args) {

        String name = "Mariia";

        for (char x = 0; x <=name.length()-1 ; x++) {

            if (name.substring(x,x+1).equalsIgnoreCase("r")){
                break;
            }
            System.out.print(name.substring(x,x+1)+" ");

        }

    }
}
