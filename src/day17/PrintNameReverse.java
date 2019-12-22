package day17;

public class PrintNameReverse {
    public static void main(String[] args) {

        String name = "Mariia";
       int x = name.length()-1;

       while (x>=0) {
           System.out.println(name.charAt(x));
           --x;
       }



    }
}
