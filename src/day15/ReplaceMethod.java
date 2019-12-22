package day15;

public class ReplaceMethod {
    public static void main(String[] args) {
        // replace methid
        String message = "I love pumpkin, pumpkin is fun!";
        message  = message.replace("pumpkin", "java");
        System.out.println(message);

        // I want to replace space from everywhere
        String message2 = "Happy Thanks Giving to All!!";
        // let create Thanksgiving together

        message2 = message2.replace("Thanks Giving", "Thanksgiving");
        System.out.println(message2);

        message2 = message2.replace("!!", "!");
        System.out.println(message2);

        // remove all the space
        message2 = message2.replace(" ", "");
        System.out.println(message2);

        String message3 = "tomorrow is off no!";
        // how  do we remove no!
        System.out.println( message3.replace(" no", ""));



    }
}
