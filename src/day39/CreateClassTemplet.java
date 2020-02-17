package day39;

public class CreateClassTemplet {

    int year;
    String model;
    String make;
    String color;

    public void goWorward() {
        System.out.println(make + " Going forward");
    }

    // create the method to print how old this car

    public void printAge() {
        System.out.println("car age: " + (2020 - year));
    }

    public void colorChange(String newColor) {
        color = newColor;
    }
}
