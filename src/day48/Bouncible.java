package day48;

public interface Bouncible {

    public static final double gravity = 9.81;

    // void bounce();    --> it works
    public abstract void bounce();

}


//    We can achieve abstraction using :
//abstract class
//interface
//both of them are abstract type
//        and can not create object out of it !!!!!
//        create an interface called Bouncible
//        it has one constant called
//        gravity as double 	and assign 9.81
//        it has 1 abstract methods :
//abstract void method bounce();
//        create 2 implementing classes of Bouncible

//        Ball
//        instance fields
//        shape as String
//        color as String
//        create constructor to set those 2 fields
//        instance methods
//        implements abstract method from interface
//toString method

//                Kangaroo
//                instance fields :
//        name as String
//        int jumpDistance
//        add constructor to set above two fields
//        instance methods :
//        implements abstract method from interface
//toString
//		eat()





