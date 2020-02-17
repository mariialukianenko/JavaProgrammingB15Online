package day47;

public abstract class Shape {

    String name;
    String color;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public abstract void calculateArea();


    @Override
    public abstract String toString();


}
