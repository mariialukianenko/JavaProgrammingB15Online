package day23;

public class ForEachMax {
    public static void main(String[] args) {

        long [] salaries = {200000, 300000, 230000, 330000, 250000};

        long max = salaries[0];
        for (long mySalaries  :  salaries ){
            if(max<mySalaries){
                max = mySalaries;
            }
        }
        System.out.println(max);
    }
}
