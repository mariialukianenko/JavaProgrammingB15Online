package day19;

import java.util.Scanner;

public class SpeedAction {
    public static void main(String[] args) {

//      int start =30;
//      int end = 45;

//        for ( int i = start; i <= end ; i++ ){
//            System.out.print(i+" ");
//        }

//        for (; start<=end; start++ ){
//            System.out.println(start);
//        }
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int end = scan.nextInt();
        for ( int i = start; i <= end ; i++ ){
           System.out.print(i+" ");
       }
    }
}
