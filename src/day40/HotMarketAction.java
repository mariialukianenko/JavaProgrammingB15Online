package day40;

import java.util.ArrayList;

public class HotMarketAction {
    public static void main(String[] args) {

        Offer o1= new Offer();
        o1.company = "Apple";
        o1.location= "Austin";
        o1.isFullTime = true;
        o1.salary = 140000;
        o1.displayInformation();


        Offer o2 = new Offer();
        o2.location = "Boston";
        o2.company =  "Google";
        o2.salary = 100000;
        o2.isFullTime = true;
        o2.displayInformation();


        Offer o3= new Offer();
        o3.company = "Amazon";
        o3.location= "San Francisco";
        o3.isFullTime = true;
        o3.salary = 120000;
        o3.displayInformation();


        Offer o4 = new Offer();
        // default value
        // for primitive number: o
                    // bolean: false
                    // char: "
        // for reference types:
                  // null
        o4.displayInformation();


        ArrayList<Offer> myOffers = new ArrayList<>();
        myOffers.add(o1);
        myOffers.add(o2);
        myOffers.add(o3);
        myOffers.add(o4);

        System.out.println("=================");

        for ( Offer  each : myOffers){
            each.displayInformation();
        }

        System.out.println("=================");

        for (int i = 0; i <= myOffers.size()-1 ; i++) {
            myOffers.get(i).displayInformation();
        }

    }
}
