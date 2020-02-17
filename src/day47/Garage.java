package day47;

public class Garage {

    public static void main(String[] args) {

        // Abstract class can not be instantiated
        // It means we can not create object out of it
//        Car c1 = new Car();

        ElectricCar c1 = new ElectricCar();

        c1.start();
        c1.goForward();
        c1.goBackward();
        c1.turn("Right");


        // create another sub class called GasCar
        // add a field called gasLevel
        // implements all the abstract method of Car class

        //create GasCar car object here
        // call all the method to test
        System.out.println("-----------------");

            GasCar g1 = new GasCar();
            g1.start();
            g1.goBackward();
            g1.goForward();
            g1.turn("Right");

    }
}
