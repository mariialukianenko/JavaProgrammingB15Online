package day47;

import day48.Employee;
import day48.FullTimeEmployee;
import day48.HourlyEmployee;

public class HR_Action {
    public static void main(String[] args) {

        //Employee e1 = new Employee()

        HourlyEmployee e1 = new HourlyEmployee("Mariia", 101, 95, 2000);
        e1.calculateAnualSalary();
        System.out.println(e1);


        FullTimeEmployee e2 = new FullTimeEmployee("Illia", 102, 10000);
        e2.calculateAnualSalary();
        System.out.println(e2);



        // each and every class we create, it will become a data type (reference type).

    }
}