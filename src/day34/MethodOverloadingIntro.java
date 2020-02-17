package day34;

import java.util.Arrays;

public class MethodOverloadingIntro {
    public static void main(String[] args) {

        // Method overloading
        // method with same name and different parameter list.


        // Method signature:
        // method name + paremeters list


        System.out.println("Method overloading");
        System.out.println(12);

        String name = "overloading";
        System.out.println(name.substring(6));
        System.out.println(name.substring(1,4));

        System.out.println(name.indexOf("di"));
        System.out.println(name.indexOf("o", 2 )); // location of second O

        sayHello();
        sayHello("Universe");
        sayHello(24);

        System.out.println(sayHello("Mariia", "Lukianenko"));


    }
    public static void sayHello(){
        System.out.println("Hello, World");
    }

    public  static void sayHello (String name){
        System.out.println("Hello, " + name);
    }

    public  static void sayHello (int num) {
        System.out.println("Hello, " + num);
    }

    public static String sayHello (String firstName, String lastName){
        return "Hello "+ firstName +" "+lastName;
    }


}
