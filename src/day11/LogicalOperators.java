package day11;

public class LogicalOperators {
    public static void main(String[] args) {
/*
        System.out.println("Truth table");
        System.out.println("Result of true and true " + (true && true));
        System.out.println("Result of true and true " + (false && true));

        System.out.println("Result of true and true " + (true || true));
        System.out.println("Result of true and true " + (false || true));
*/
       int num = 101;
        System.out.println(num>100 || num<10);

       System.out.println(num >=10 && num <=60);

        int x = 55;
       System.out.println(x>50 && x!=52 || x==57);


    }
}
