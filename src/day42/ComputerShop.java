package day42;

public class ComputerShop {
    public static void main(String[] args) {

        Computer c1 = new Computer();
        c1.setBrand("Apple");
        c1.setRam(128);
        c1.setPrice(1400);

        c1.runProgram();
        c1.calculate();

        System.out.println(c1.toString());

        int myRam = c1.getRam();

        System.out.println("My ram is " + myRam);


        Computer c2 = new Computer();
        c2.setBrand("Lenovo");
        c2.setPrice(c1.getPrice() / 2);
        c2.setRam(myRam / 2);

        System.out.println(c2.toString());
    }
}
