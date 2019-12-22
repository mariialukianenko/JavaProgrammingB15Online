package day09;

public class DayPrinterVersion2 {
    public static void main(String[] args) {


        System.out.println("Please enter the number of day:");
        int numberDay = 3;
        String dayName = "";


        if (numberDay==1)
           dayName="Monday";
        else if (numberDay==2)
            dayName="Tuesday";
        else if (numberDay==3)
            dayName="Wednesday";
        else if (numberDay==4)
            dayName="Thursday";
        else if (numberDay==5)
            dayName="Friday";
        else if (numberDay==6)
            dayName="Saturday";
        else if  (numberDay==7)
            dayName="Sunday";
        else
            dayName="Unknow";


        System.out.println("Day in "+ dayName);
    }
}
