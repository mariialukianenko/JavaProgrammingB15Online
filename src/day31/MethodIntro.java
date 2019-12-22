package day31;

public class MethodIntro {
    public static void main(String[] args) {

        //two ways to call static method
        //ClassName.methodName(external data if needed)
        // if you are in same class you can directly called them methodName(external data if needed)
       // MethodIntro.sayHello();  // optional if you are in same class
        sayHello();
        sayHello();


    }  // main method ends here!!!

        // do not create a method inside main method
        public static void sayHello() {
            System.out.println("Hello World.");
            System.out.println("My name is Mariia.");
            System.out.println("I love Java.");


    }
}
