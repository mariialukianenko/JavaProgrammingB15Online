package day41;

//  turnOn,   turnOff,  getCurrentChannel,  setCurrentChannel (newChannelNumber)
//  moveForward,   moveBackward

public class WarmUpTaskTV {

    String brand;
    boolean isOn;
    int currentChannel;


    public int getCurrentChannel(){
        return currentChannel;
    }


    // we can not set a channel if TV is off
    public void setCurrentChannel (int newChannelNumber) {

        if (isOn == true) {
            currentChannel = newChannelNumber;
        }else{
            System.out.println("Turn on the TV first");
        }
    }


    public void turnOn() {

        if (isOn == false) {
            System.out.println("Turning on TV");
            isOn = true;
        }
    }


    public void turnOff() {

        if (isOn == true) {
            System.out.println("Turning off TV");
            isOn = false;
        }
    }


    public String toString() {
        return "WarmUpTaskTV{" +
                "brand='" + brand + '\'' +
                ", isOn=" + isOn +
                ", currentChannel=" + currentChannel +
                '}';
    }
}
