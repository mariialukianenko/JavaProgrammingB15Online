package day38;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OfficeHourPart2 {

    public static void main(String[] args) {

        /*
        Given a ArrayList of 10 String(yes String) as scores "79" , "54" , "100", "65", "44"....
          * print pass if its more than 60 fail if not
          * count how many score are more than 90
          * get the average score
          * update the values with score-grade pair
          for example
          79C , 54F, 100A, 65D, 44F , 89B , 95A
          Optionally create 4 methods according to above criteria
         */

        // this is the short way to create list that non-resizable, no change!
        List<String> numLst = Arrays.asList("79", "54", "100", "65", "44", "78", "68", "98", "89", "77");
        System.out.println(numLst);

        for ( String each : numLst){
            int eachNum = Integer.parseInt(each);
            if (eachNum > 60){
                System.out.println("Pass: " + eachNum);
            }else{
                System.out.println("Fail: " + eachNum);
            }
        }

        int count = 0;
        for ( String each : numLst){
            if (Integer.parseInt(each) > 90){
                count++;
            }
        }
        System.out.println("Count of more than 90 = " + count);

        // get the avarage score
        int sum = 0;
        for ( String each : numLst){
            sum = sum + Integer.parseInt(each);
        }
        System.out.println("Sum = " + sum);
        System.out.println("Avarage = " + sum/numLst.size());

        // update the values with score-grade pair
        //for example
        //79C , 54F, 100A, 65D, 44F , 89B , 95A

        // go through each and every number
        // check the number for the range value so we can decide it's A, B...
        // then use the set method to update the current value to new value
        numLst.set(0,numLst.get(0)+"C");

        // finish using that logic
    }
}