package day48;

public class HourlyEmployee extends Employee {

//    String name;
//    int id;
    double hourlyWage;
    int numsOfHours;   // annual hours worked

    public HourlyEmployee( String name, int id, double hourlyWage, int numsOfHours) {
        super(name, id);
        this.hourlyWage = hourlyWage;
        this.numsOfHours = numsOfHours;
    }


@Override
    public void calculateAnualSalary(){
        System.out.println("hourly employee yearly: " + (hourlyWage * numsOfHours));
    }


    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyWage=" + hourlyWage +
                ", numsOfHours=" + numsOfHours +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
