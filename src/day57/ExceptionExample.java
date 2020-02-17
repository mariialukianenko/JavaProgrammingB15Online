package day57;

public class ExceptionExample {

    public static void main(String[] args) {
        System.out.println("Hello B15 Online Friends!");

      //  int num = 2.5;      compile error
      int [] nums = new int [3];   // index 0, 1, 2
      nums[0] = 55;
      nums[1] = 56;
      nums[2] = 100;
     // nums[10] = 200;  // Run time error here.  it is compile,
        // but java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 3
        System.out.println("!!!!!");

       // int result = 10/0;    java.lang.ArithmeticException: / by zero
       // System.out.println(result);

    }

}
