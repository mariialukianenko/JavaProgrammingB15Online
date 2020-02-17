package day57;

public class TryCatch {
    public static void main(String[] args) {

        System.out.println("Before try catch.");
        try {
            System.out.println("In try block.");
            int result = 10 / 0;
            System.out.println("After 10/0 line");
        }catch (ArithmeticException e){
            System.out.println("Exception happened and was caught and handled!");
        }
        System.out.println("After try catch.");

        System.out.println("=================");

        try{
            System.out.println("In second try block.");
            String str = "Java is fun!";
            System.out.println(str.charAt(0));
            System.out.println(str.charAt(30));
            System.out.println(str.charAt(1));
        }catch (Exception e){
            System.out.println("Exception happened in try block and caugh.");
        }

        System.out.println("After second try catch.");
    }
}
