package day33;

public class NumberActions {
    public static void main(String[] args) {

        System.out.println(getSumFrom1ToX(3));
        System.out.println(getSumFrom1ToX(10));

        System.out.println(build_GOT_Email("john", "snow"));

    }

    public static int getSumFrom1ToX(int number){

        int sum = 0;
        for (int x = 1; x <= number ; x++) {
            sum = sum + x;
        }

        return sum;
    }

    public static String build_GOT_Email(String firstName, String lastName){

        String result = firstName.substring(0,1) + lastName+"@nightwatch.com";
        return result;
    }

}
