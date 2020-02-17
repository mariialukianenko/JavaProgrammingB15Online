package day42;

public class Computer {

    // attributes
   private String brand;
   private int ram;
   private double price;

    // behaviour:  runProgram (shoud between 1-128),  calculate - print brand is calculating
    // add getters and setters
    // ram can not be less than 1 and more than 128
    // price can not be less the 20$
    // add toString method


    public void runProgram(){
        System.out.println(this.brand + " --- " +this.ram);  // or just ram
    }

    public void calculate(){
        System.out.println(brand + " is calculating.");
    }



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        if (ram >= 1 && ram <= 128) {
            this.ram = ram;
        }
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 20) {
            this.price = price;
        }
    }

    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }
}
