package day06;

public class CompoundOperator {
    public static void main(String[] args) {

        // += -= *= /= %=   ----> shorthand operator

        int studentOnline = 263;
        studentOnline += 5;
        System.out.println(studentOnline);

        studentOnline -= 3;
        System.out.println(studentOnline);

        studentOnline *= 2;
        System.out.println(studentOnline);

        studentOnline /= 3;
        System.out.println(studentOnline);

        int bankBalance = 120000;
        System.out.println("I have spend half of it: "+bankBalance);
        //bankBalance = bankBalance/2;
        bankBalance /= 2;
        System.out.println("Now it is "+ bankBalance);

        bankBalance %= 570;
        System.out.println("I have "+ bankBalance);






    }
}
