package day58;

public class TryCatchFinally {
    public static void main(String[] args) {

        System.out.println("Before tru catch");

        try{
            System.out.println("Hello from try block");
            String str = null;
            System.out.println(str.length());
        }catch (Exception e){
            System.out.println("Exception happened and caught");
        }

        System.out.println("After try catch");

        System.out.println("============");

        try{
            System.out.println("Hello from try block");
            String str = null;
            System.out.println(str.length());
        }catch (Exception e){
            System.out.println("Exception happened and caught");
        }finally {
            System.out.println("Finally block. runs even is exception or no exception");
        }
    }
}
