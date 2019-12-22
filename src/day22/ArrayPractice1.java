package day22;

public class ArrayPractice1 {
    public static void main(String[] args) {

        double[] prices  = new double[5];
        System.out.println(prices); // can not

        prices[0] = 50.50;
        prices[1] = 56.50;
        prices[2] = 15.50;
        prices[3] = 40.50;
        prices[4] = 50;

        System.out.println(prices[0]);
        System.out.println(prices[1]);
        System.out.println(prices[2]);
        System.out.println(prices[3]);
        System.out.println(prices[4]);

        System.out.println("----------------");

        char[] letter = new char[5];
        letter[0] = 'M';
        letter[1] = 'A';
        letter[2] = 'S';
        letter[3] = 'H';
        letter[4] = 'A';

        System.out.println(""+letter[0] + letter[1]+letter[2]+letter[3]+letter[4]);
        System.out.println(letter); // this works also. only for char


        System.out.println("----------------");

        boolean[] yesNo = new boolean[3];

        yesNo[0] = true;
        yesNo[1] = false;
        yesNo[2] = 10>7; //generate true result

        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);

    }
}
