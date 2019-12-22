package day22;

public class ArrayIntro {
    public static void main(String[] args) {

        int num1 = 10; // like we did before


        // syntax for creating variable to store multiple items

        int [] score = new int[4];
        score[0] = 95;
        score[1] = 70;
        score[2] = 88;
        score[3] = 100;
        System.out.println( score[0] );
        System.out.println( score[1] );
        System.out.println( score[2] );
        System.out.println( score[3] );

        // updating the value at certain index
        score[1] = 99;
        System.out.println(score[1]);

        System.out.println("------------------");

        int[] numbers = new int [3];
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        System.out.println("------------------");

        byte [] data = new byte[4];
        data[0] = 12;
        data[1] = 16;
        data[2] = 45;
        data[3] = 78;

        data[1] = 89;

        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);



    }
}
