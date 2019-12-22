package day07;

public class Casting {
    public static void main(String[] args) {

        //int num = 10;
        double bigNum = 10;
        System.out.println(bigNum);

        //int num = 12.99; //int can not hold double. It is error
        int num = (int) 12.99;
        System.out.println(num);

        long num1 = (long) 78766.579;
        System.out.println(num1);

        int num2 = (int) 1789890.89;
        System.out.println(num2);

        long num3 = 156576879808l;
        int num4 = (int) num3;
        System.out.println(num4);

        long num5 = 10000;    //10000l
        int num6 = (int) num5;
        System.out.println(num6);






    }
}
