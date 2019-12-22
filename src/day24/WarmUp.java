package day24;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class WarmUp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 words: ");

        String [] words = {scan.next(), scan.next(), scan.next()};

        System.out.println("You entered: "+Arrays.toString(words));

        for ( String W : words){
            System.out.println(W);
        }
        System.out.println("----------------");
        for (int i = 2; i >=0 ; i--) {
            System.out.println(words[i]);
        }

    }
}
