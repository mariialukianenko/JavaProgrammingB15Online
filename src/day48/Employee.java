package day48;

public abstract class Employee {


    String name;
    int id;

    public Employee(){

    }

    // constructor
    // we can call it in sub class, we can reuse
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }


    public abstract void calculateAnualSalary();


    // This is optional : the only reason we put it in here was
    // to enforce sub class to provide toString method

    public abstract String toString();


}


//    Warm up
//----------
//abstract super class called Employee
//        instance fields : name , id
//        Constructor : to set all the fields
//abstract methods :
//        calculateAnualSalary
//        toString

//        HourlyEmployee
//        instance fields :
//        hourlyWage , numsOfHours ,
//        Constructor : to set all the fields
//        instance methods ;
//        calculateAnualSalary
//        toString
//        ----------------
//        FullTimeEmployee
//        instance fields :
//        monthlySalary
//        Constructor : to set all the fields
//        instance methods ;
//        calculateAnualSalary
//        toString