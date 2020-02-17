package day48;

// a non abstract sub class of abstract super class
// is called concrete class
// this class is responsible providing body (implementation)
// for all abstract methods from super class
public class FullTimeEmployee extends Employee {

         double monthlySalary;


    public FullTimeEmployee(String name, int id, int monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;

    }

    @Override
    public void calculateAnualSalary(){
        System.out.println("FullTime employee yearly: " + monthlySalary * 12);
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "monthlySalary=" + monthlySalary +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
