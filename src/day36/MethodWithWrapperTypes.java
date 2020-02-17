package day36;

public class MethodWithWrapperTypes {
    public static void main(String[] args) {

        // it can store Integer object
        // auto-boxing
        Integer i1 = 12;
        Integer i2 = 13;
        sumAndPrint(i1, i2);
        sumAndPrint(12,15);   // --> most popular way
        sumAndPrint(Integer.valueOf(12), Integer.valueOf(8));
        sumAndPrint(new Integer(5), new Integer(7));
        System.out.println();
        printTheDoubleValue(5);
    }
    // this method add 2 Inteher numbers and print
    public static void sumAndPrint(Integer num1, Integer num2){

        // we can not add two object
        // the moment the + operator appeared
        // compiler will turn num1 and num2 into int so it can add them numerically
        // Integer to int = auto-unboxing
        System.out.println(num1+num2);

    }
    public static void printTheDoubleValue(int x){
        System.out.println(x*2);
    }
}
