package day13;

public class StringMethod {
    public static void main(String[] args) {

        String s1 = "Hello";
        System.out.println( s1.equals("abc") );
        System.out.println(s1.equalsIgnoreCase("HELLO"));

        System.out.println( s1.toUpperCase() );
        System.out.println( s1.toLowerCase() );


        String name = "Mariia";
        System.out.println("My name is " + name.toUpperCase());
        System.out.println("My name is " +name.toLowerCase());
        System.out.println(name.length());

        int lengthOfString = s1.length();
        if (lengthOfString > 4) {
            System.out.println("More than 4 character.");
        } else {
            System.out.println("Not more than 4.");
        }


    }
}
