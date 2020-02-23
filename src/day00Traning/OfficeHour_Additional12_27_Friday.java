package day00Traning;

public class OfficeHour_Additional12_27_Friday {

    public static void main(String[] args) {

      method1();
        System.out.println();
      method2();
        System.out.println();

        System.out.println(eligible(21));
        System.out.println(eligible(24));

    }
    // methods - grouping a series of statements together to perform a specific action.

    // methods can make our codes more reusable
    public static void method1(){
        System.out.println("Hello Batch 15");
    }

    public static void method2(){
        if(false) {
            return;
        }
        System.out.println("Test completed.");
        }

        public static double method3(){

        return 10.5f;
        }
    public static boolean eligible(int age){
        if (age > 21){
            return true;
        }
        return false;
    }

    }

