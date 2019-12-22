package day08;

public class IfStatement {
    public static void main(String[] args) {

        int speedLimit = 60;
        int yourCurrentSpeed = 45;


        boolean amISSpeeding = yourCurrentSpeed > speedLimit;
        //if (amISSpeeding) {
        //if (true) {
        if (yourCurrentSpeed>speedLimit) {
            System.out.println("Get pulled over by police");
            System.out.println("Go to court");
        }else {
            System.out.println("go shopping");
            System.out.println("buy icecream");

        }
        System.out.println("the end");
        }

    }

