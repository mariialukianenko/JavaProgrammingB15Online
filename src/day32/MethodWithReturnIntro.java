package day32;

public class MethodWithReturnIntro {
    public static void main(String[] args) {
      String name =   giveMeMyName();
        System.out.println(name);

        int myResult = doubleTheNumber(10);
        System.out.println(myResult);

        System.out.println("result of doubling 100 is "+doubleTheNumber(100));

        int add14to16result = add2Numbers(14,16);
        System.out.println(add14to16result);

        // or directly print it
        System.out.println(add2Numbers(14,16)+5);
    }

    public static int add2Numbers (int num1, int num2){

        return num1 + num2;
    }



    //purpose of return the value
    //we can save the result after calling the method
    // and use it somewhere else
    public static int doubleTheNumber(int num){
        System.out.println("double : "+ num);
        int result = num *2;
        return result;
    }

    public static String giveMeMyName(){

        return "Mariia";
    }

}
