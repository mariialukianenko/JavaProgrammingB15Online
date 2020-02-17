package day42;

public class Movie {

   private String name;
   private double length;
   private String type;


    // write a constractor to set all the field value
    public Movie(){
        System.out.println("Empty movie");
    }

    // write a constructor to set all the fields value

    public Movie(String name, double length, String genre) {
        this.name = name;
        this.length = length;
        this.type = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getType() {
        return type;
    }

    public void setType(String genre) {
        this.type = genre;
    }

    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", genre='" + type + '\'' +
                '}';
    }
}
