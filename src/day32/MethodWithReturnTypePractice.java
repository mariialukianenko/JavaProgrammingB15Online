package day32;

public class MethodWithReturnTypePractice {
    public static void main(String[] args) {

      //  System.out.println(10/0);

        System.out.println(divide(10, 3));
        System.out.println(divide(10, 0));
    }



    public static double divide (double num1, double num2){
        // to avoid to get result we did not wanted
        if (num2 == 0){
            return 0;
        }else{
            return  num1/num2;
        }

    }
}
