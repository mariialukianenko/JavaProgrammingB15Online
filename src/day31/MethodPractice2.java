package day31;

public class MethodPractice2 {

        // write piece of reusable code to count from 1 to 10
       // give a name count1to10
    public static void count1to10(){
        for (int i = 1; i <= 10 ; i++) {
            System.out.print(i+" ");
        }

    }


        public static void main(String[] args) {

        count1to10();
         System.out.println();
        count1to10();
            System.out.println();
        MethodPractice2.count1to10(); // +one time will print

    }

}
