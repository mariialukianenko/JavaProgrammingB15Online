package day42;

public class Bike {

    int speed;
    int gear;


    //has no return type. It the same name as a class
    // we can call this when object is being created
    public Bike(){
        System.out.println("Message from constructor.");
        gear = 1;

    }

    public Bike(int newGear){
        gear = newGear;
    }

    public Bike (int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }


    public Bike(String str){
        System.out.println("Accept string.");
    }


}
