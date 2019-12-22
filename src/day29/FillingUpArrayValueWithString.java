package day29;

import java.util.Arrays;

public class FillingUpArrayValueWithString {
    public static void main(String[] args) {

        String [] name = new String[100];

        for (int i = 0; i <= name.length-1 ; i++) {
            name[i] = i+1  + ". I love Java";
        }
        System.out.println(Arrays.toString(name));



    }
}
