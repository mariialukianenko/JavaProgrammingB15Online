package day19;

import java.util.Scanner;

public class SpeedActionSlowDown {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int end = scan.nextInt();

        if (start < end) {
            for (int i = start; i <= end; i++) {
                System.out.print(i + " ");
            }

        }else if (start > end){
            for (int x = start; x> end; x--){
                System.out.print(x+" ");
            }
        }else
            System.out.println("Same speed");
        }
    }
