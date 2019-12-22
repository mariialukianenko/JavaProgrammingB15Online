package day23;

public class ForEachLoopPractice {
    public static void main(String[] args) {

        long [] salaries = {200000, 300000, 230000, 330000, 250000};

        for ( long mySalary : salaries){
                System.out.println("My salaries: " + mySalary);
        }

        System.out.println("--------------");
        for (    long   money   :  salaries    ) {
            if (money>=250000){
                System.out.println("Money: "+money);
            }
        }

        System.out.println("------------");


        for (    long   dollar   :  salaries    ) {
            if (dollar>=250000){
                continue;
            }
            System.out.println("Dollar: "+dollar);
        }

    }
}
