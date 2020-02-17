package day49;

public class TeslaShopMain {

    public static void main(String[] args) {
        Tesla t1 = new Tesla(2020, 460, "Cyber Truck");

        t1.start();
        t1.selfDrive();
        t1.goForward();
        t1.charge();

        System.out.println(t1);
    }

}
