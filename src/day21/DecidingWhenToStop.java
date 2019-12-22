package day21;

public class DecidingWhenToStop {
    public static void main(String[] args) {
        String msg = "Hello Word";
        int charCount = msg.length();

        for (int i = 0; i <= charCount-3 ; i++) {
            System.out.println(msg.substring(i,i+3));

        }
    }
}
