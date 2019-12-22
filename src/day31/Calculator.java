package day31;

public class Calculator {

    public static void main(String[] args) {

        add(6, 24);
        add(5, 9);
        add3Numbers(3, 6, 9 );

    }
    // a ststic method that has 2 parameters
    public static void add ( int num1, int num2 ){

        System.out.println("addition result "+ (num1 + num2));

    }

    public static void add3Numbers(int num1, int num2, int num3){
        System.out.println("Result: "+(num1+num2+num3));
    }
}
