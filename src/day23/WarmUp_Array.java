package day23;

public class WarmUp_Array {
    public static void main(String[] args) {

        int[] number = {1, 4, 6, 7, 9, 3, 10};

        for (int x = number.length-1; x >= 0; x--) {
            System.out.println(number[x]);
        }
        int lastItem = number[number.length-1];
        System.out.println("Last number: "+lastItem);
        
        int middle = number[number.length/2];
        System.out.println("middle = " + middle);

        System.out.println("-----------------");

        int sum = 0;
        for (int i = 0; i <= number.length-1 ; i++) {
            sum = sum+number[i];
        }
        System.out.println("sum = " + sum);
        
        int max = number[0];
        for (int y = 0; y <=number.length-1 ; y++) {
            if (number[y]>max){
                max = number[y];
            }
        }
        System.out.println("max = " + max);



    }
}
