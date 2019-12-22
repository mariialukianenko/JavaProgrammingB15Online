package day26;

import java.util.Arrays;

public class StringToChar {
    public static void main(String[] args) {

        String name = "Mariia, Illia, Valentina, Alexandr, Olya, Georgiy, Irina";
        String newName = name.replace(", ", "");

        char [] array = newName.toCharArray();
        System.out.println(Arrays.toString(array));

        for (int i = 0; i <= array.length-1 ; i++) {

                System.out.print(array[i] + "-->");

        }

    }
}
