package day47;

public class GasCar extends Car {

    // this is called concrete class
    // concrete class must provide body for all inherited abstract method
    // or it will not even compile
    int gasLevel;


    @Override
    public void start() {
        System.out.println("Gas car starting");
    }

    @Override
    public void goForward() {
        System.out.println("Go forward");
    }

    @Override
    public void goBackward() {
        System.out.println("Go backward");
    }

    @Override
    public void turn(String direction) {
        System.out.println("direction: " + direction);
    }
}