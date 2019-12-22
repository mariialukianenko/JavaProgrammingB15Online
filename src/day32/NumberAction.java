package day32;

public class NumberAction {

    public static void main(String[] args) {

        numberComparision(5, 3);
        numberComparision(3, 5);
        numberComparision(5, 5);

        stringRepeater("Hello", 5);

        skipCountBy3From0To50();

        countDownByEvenNumberFrom50To0();

        print1ToX(6);

        countDownByEvenNumberFromXToY(10,2);

    }
    public static void numberComparision (int num1, int num2){

        if (num1>num2){
            System.out.println(num1+" more than "+ num2);
        } else if (num1<num2) {
            System.out.println(num1 + " less than " + num2);
        }else {
            System.out.println("They are equal.");

        }
    }

    public static void stringRepeater (String strToRepeat, int count){

        for (int i = 1; i <= count ; i++) {
            System.out.print(strToRepeat+" ");

        }
        System.out.println();
    }

    public static void skipCountBy3From0To50(){
        for (int i = 0; i <=50 ; i=i+3) {
            System.out.print(i+" ");

        }
        System.out.println();
    }

    public static void countDownByEvenNumberFrom50To0(){
        for (int j = 50; j >=0 ; j--) {
            if (j%2==0){
                System.out.print(j+" ");
            }
        }
        System.out.println();
    }

    public static void print1ToX (int x){
        for (int k = 1; k <= x ; k++) {
            System.out.print(k+" ");

        }
        System.out.println();
    }

    public static void countDownByEvenNumberFromXToY(int x, int y){
        for (int i = x; i >= y ; i--) {
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
