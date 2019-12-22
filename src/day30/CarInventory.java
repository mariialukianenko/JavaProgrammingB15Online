package day30;

import java.util.Arrays;

public class CarInventory {
    public static void main(String[] args) {

        String [] cars = {
                "Acura-NSX",
                "Chevrolet-Corvette",
                "Chevrolet-Cavalier",
                "BMW-3 Series",
                "Pontiac-LeMans",
                "BMW-7 Series",
                "Oldsmobile-Achieva",
                "Honda-Civic"};
        // count chevrolet and civic

        int countChevy = 0;
        int countCivic = 0;
        for (String eachCar : cars){
            if (eachCar.contains("Chevrolet")){
                countChevy++;
            }else if (eachCar.contains("Civic")){
                countCivic++;
            }

        }
        System.out.println(countChevy);
        System.out.println(countCivic);

        // print location of civic
        for (int x = 0; x <= cars.length-1 ; x++) {
            if (cars[x].contains("Civic")){
                System.out.println("Location of Civic: " + x);
            }
        }

        // task. print make and model separetly.
        String eachCar = "Honda-Civic";
        String[] eachCarSplitted = eachCar.split("-");
        System.out.println("Car make is: "+eachCarSplitted[0]+". Car model is: "+ eachCarSplitted[1]);

        System.out.println("=========");

        for (String eachCarrr : cars){
            if (eachCarrr.startsWith("Chevrolet")){
                System.out.println(eachCarrr);
            }
        }


        System.out.println("================");
        for (int i = 0; i <= cars.length-1 ; i++) {
            if (cars[i].contains("Chevrolet")){
                String[] eachSplitted = cars[i].split("-");
                System.out.println("Car make is: "+eachSplitted[0]+". Car model is: "+ eachSplitted[1]);
            }
        }

        System.out.println("-----------------------");

        // find car with model has only 3 caharacter
       // print them out and get the count

        int countModel = 0;
        for (String each : cars){
            String[] eachSplit = each.split("-");
            if (eachSplit[1].length()==3){
                countModel++;
                System.out.println(each);
                System.out.println(countModel);
            }
        }
        System.out.println("===-====-=====-====-");
        String car = "Lexus-IS-F";
        String[] CarSplitted = car.split("-",2);
        System.out.println(Arrays.toString(CarSplitted));

    }
}
