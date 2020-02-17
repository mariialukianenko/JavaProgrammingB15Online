package day40;

import java.util.ArrayList;

public class Offer {

    String location;
    String company;
    long salary;
    boolean isFullTime;


    // this is a instance method to print all information about offer progect

    // inside instance method we can directly access instance variable
    public void displayInformation(){
        System.out.println("Location = " + location + " | "
                         + "Company = " + company + " | "
                         + "Salary = " + salary + " | "
                         + "isFullTime = " + isFullTime);
    }


    public void  turnToFullTime(){

        if(isFullTime == false) {
            isFullTime = true;
        }else{
            System.out.println("Already fulltime");
        }
    }

    // write a method to change the location of the Offer
    // to the location user passed
    public void changeLocation(String newLocation){

       location = newLocation;

    }

    // wtite a method to accept 4 paramerers to chang all info about offers
    public void chanheAllInfo(String newCompany, String newLocation, long newSalary, boolean newIsFullTime){

        company = newCompany;
        location = newLocation;
        salary = newSalary;
        isFullTime = newIsFullTime;

        // an instence method can call another instance method
        displayInformation();
    }

    // write a method to check the offer belong to 100K club and return a true result
    public boolean is100KOffer(){

        return salary >= 100000;
    }

    //crate the instance method called toString
    // has no parameter
    // return String representation of offer project

    public String toString(){

        String str =  "[Location = " + location + " | "
                + "Company = " + company + " | "
                + "Salary = " + salary + " $ | "
                + "isFullTime = " + isFullTime + "]";

        return str;
    }
}
