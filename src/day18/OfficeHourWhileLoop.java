package day18;

public class OfficeHourWhileLoop {
    public static void main(String[] args) {
          //           01234567890123456
        String name = "Mariia Lukianenko";
        //getting each character using charAt(index)
        //generate sequential number 0 ---> 16

        int x = 0;

            while (x<name.length()){
                System.out.println("index: " + x);
                System.out.println(name.charAt(x));
                ++x;
            }


    }
}
