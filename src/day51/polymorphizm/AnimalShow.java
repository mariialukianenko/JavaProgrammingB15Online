package day51.polymorphizm;

public class AnimalShow {

    public static void main(String[] args) {


//        Dog d1 = new Dog();

        // we are referring Dog object using Animal reference

        Animal a1 = new Dog();
        a1.makeNoise();
// here we are just reassigning a1 to different object
        a1 = new Horse();
        a1.makeNoise();


    }

}
