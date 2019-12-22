package day00Traning;
import java.util.Scanner;
import java.util.Arrays;
public class Repl129 {
    public static void main(String[] args) {

        String[] arr = {"zero", "one", "two","three","four"};


        int count = 0;
        for (int i = 0; i <= arr.length-1 ; i++) {
            if (arr[i].contains("e")){
                count++;
            }
        }
        System.out.println(count);

        int k = 0;
        String[] fewValues = new String[count];
        for (int j = 0; j <= arr.length-1 ; j++) {
            if (arr[j].contains("e")){
                fewValues[k] =  arr[j];
                k++;
            }
        }
        System.out.println(Arrays.toString(fewValues));


    // return fewValues;

    }
}
