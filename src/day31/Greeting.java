package day31;

public class Greeting {
    public static void main(String[] args) {

        sayHello();
        sayHelloTo("Batch 15");
        sayHelloTo("Illia");
    }

    public static void sayHelloTo(String name){
        System.out.println("hello " + name);
    }


    public static  void sayHello(){
        System.out.println("Hello B15");
    }


}
