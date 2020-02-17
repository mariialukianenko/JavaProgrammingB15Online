package day34;

public class OverLoadingPractice {
    public static void main(String[] args) {

        add(15);
        add(15, 45);
        add(15, 67, 23);
        add(15L, 23L);

    }
    public static void add (int num){
        System.out.println(num+100);
    }
    public static void add (int num1, int num2){
        System.out.println(num1+num2);
    }
    public static void add (int num1, int num2, int num3){
        System.out.println(num1+num2+num3);
    }
    public static void add (long num1, long num2){
        System.out.println(num1+num2);
    }
}
