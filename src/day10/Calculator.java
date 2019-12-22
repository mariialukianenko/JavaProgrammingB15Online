package day10;

public class Calculator {
    public static void main(String[] args) {
        char operator = '+';

        switch (operator){

            case '*' :
                System.out.println("You are about to multiply number.");
                break;
            case '/':
                System.out.println("You are about to divide number.");
                break;
            case '+':
                System.out.println("You are about add number.");
                break;
            case '-':
                System.out.println("You are about to subtract numbers.");
                break;
            default:
                System.out.println("Unknown operators.");
                break;



        }



    }
}
