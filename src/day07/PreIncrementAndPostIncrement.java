package day07;

public class PreIncrementAndPostIncrement {
    public static void main(String[] args) {

        int apple = 8;
       apple++;

        System.out.println(apple);
        System.out.println(++apple);

        System.out.println(apple++);
        // post imcrement, it will increse the value, but it will reflect the value next time the variable show up
        System.out.println(apple);


    }
}
