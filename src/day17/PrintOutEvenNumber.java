package day17;

public class PrintOutEvenNumber {
    public static void main(String[] args) {

        int count = 0;

        while ( count < 50 ){
            count += 2;
            System.out.print(count + " ");
        }

        System.out.println();

        int countOdd = 1;
        while ( countOdd <= 49 ){
            System.out.print(countOdd + " ");
            countOdd += 2;
        }
    }
}
