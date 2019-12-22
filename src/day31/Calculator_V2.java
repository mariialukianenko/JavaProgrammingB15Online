package day31;

public class Calculator_V2 {
    public static void main(String[] args) {

//        char operator = '+'; // it can be + - * /
//        int num1 = 15;
//        int num2 = 3;

        calculat('*', 4, 7);
        calculat('+', 24, 24);
        calculat('F', 6, 6);


    }

    public static void calculat(char operator, int num1, int num2){

        switch (operator){
            case'+':
                System.out.println("Addition result is "+(num1+num2));
                break;
            case'-':
                System.out.println("Subtraction is "+(num1-num2));
                break;
            case'*':
                System.out.println("Multiplication is "+(num1*num2));
                break;
            case'/':
                System.out.println("Division is "+(num1/num2));
                break;
            default:
                System.out.println("Invalid operator.");
        }


    }
}
