package day26;

import java.util.Arrays;

public class StringToCharWithSplit {
    public static void main(String[] args) {

        String name = "Mariia, Illia, Valentina, Alexandr, Olya, Georgiy, Irina";

        String [] array = name.split(", ");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i <= array.length-1 ; i++) {
            for (int j = 0; j <= array[i].length()-1 ; j++) {
                System.out.print(array[i].charAt(j)+"-->");
            }
            System.out.println();
        }

    }
}
