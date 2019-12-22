package day00Traning;

import java.util.Arrays;
import java.util.Scanner;

public class Repl126 {
    public static void main(String[] args) {

//        Write a program that will find out shortest words in the given string str.
//        If there are few words that are evenly short, print them all.
//                Use split method in order to split str string variable and create an array of strings.
//                Print array with Arrays.toString() method. Sort array before printing.
//        Split values by comma: split(", ");

        // olive, fish, pursuit, old, warning, python, java, coffee, cat, ray

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String[] array = str.split(", ");
        System.out.println(Arrays.toString(array));

        String shortestWord = array[0];
        for (int i = 0; i <= array.length-1 ; i++) {
            if (shortestWord.length()-1 > array[i].length()-1){
                shortestWord = array[i];
            }
        }

        String allShortWorlds = "";
        for (int j = 0; j <= array.length-1 ; j++) {
            if (shortestWord.length()-1 == array[j].length()-1){
                allShortWorlds = allShortWorlds + array[j]+" ";
            }
        }
        System.out.println(allShortWorlds);

        String [] finalString = allShortWorlds.split(" ");
        Arrays.sort(finalString);
        System.out.println(Arrays.toString(finalString));




    }
}
