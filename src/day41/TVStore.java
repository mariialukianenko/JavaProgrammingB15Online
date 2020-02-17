package day41;

public class TVStore {
    public static void main(String[] args) {


        WarmUpTaskTV t1 = new WarmUpTaskTV();
        t1.brand = "Sony";

        System.out.println("t1: " + t1);

        t1.turnOn();
        t1.setCurrentChannel(12);

        System.out.println(t1.getCurrentChannel());
        t1.turnOff();

        System.out.println(t1.toString());

    }
}
