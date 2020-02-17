package day34;

public class WarmUpTask {
    public static void main(String[] args) {

        int digit1, digit2, digit3;

        digit1 = 3;
        digit2 = 7;
        digit3 = 6;

        int number = digit1*100 + digit2*10+digit3;
        System.out.println(number);

        System.out.println(build3DigitNumber(6,4,0));

        System.out.println(build3DigitNumber(-5,56,7));
        System.out.println(build3DigitNumber(5,67,2));

        int result1 = build3DigitNumber(6,14,0);
        System.out.println(result1);
        int result2 = build3DigitNumber(67,34,9);
        System.out.println(result2);

        System.out.println("result1 + result2 "+ (result1+result2));



    }

    // public - access modifier
    // static - does not an object to call
    // void - return type, does not return anything
    // String name - method parameter
    // "Mariia" - argument, the actual data that you passed

    public static int build3DigitNumber(int digit1, int digit2, int digit3){

        if (digit1<0 || digit1>9){
            digit1=0;
        }
        if (digit2<0 || digit2>9) {
            digit2 = 0;
        }
        if (digit3<0 || digit3>9) {
            digit3 = 0;
        }

        int number = digit1*100 + digit2*10+digit3;
        return number;
    }

}
