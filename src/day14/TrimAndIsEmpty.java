package day14;

public class TrimAndIsEmpty {
    public static void main(String[] args) {
        String message = "   Repl is coming";

        System.out.println(message);

        System.out.println(message.length());

        message = message.trim();
        // used take out spaces on two sides
        System.out.println(message);

        System.out.println(message.isEmpty());
        


    }
}
