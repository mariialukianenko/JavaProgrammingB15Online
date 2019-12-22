package day32;

public class MethodWithReturnIntro {
    public static void main(String[] args) {
      String name =   giveMeMyName();
        System.out.println(name);

        int myResult = doubleTheNumber(10);
        System.out.println(myResult);

        System.out.println("result of doubling 100 is "+doubleTheNumber(100));
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
