package day47;

public class Rectangle extends Shape {

    int width;
    int height;

    public Rectangle(String color, String name, int width, int height) {
        super(color, name );
        this.width = width;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of rectangular is "+height*width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
