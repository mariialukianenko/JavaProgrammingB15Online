package day26;

import java.util.Arrays;

public class SplitArrayPractice {
    public static void main(String[] args) {

        String student = "Abbos, Zulyar, Zhibek, Hasan, Beza, Muge, Orhan, Susan";
        //Spell the name of each person

        student = student.replace(" ", "");

        String[] namesArray = student.split(",");
        System.out.println(Arrays.toString(namesArray));

        String name = namesArray[0];
        for (int i = 0; i <= name.length()-1 ; i++) {
            System.out.print(name.charAt(i)+"-");
        }


        System.out.println();
        for (int x = 0; x <=namesArray.length-1 ; x++) {
            for (int y = 0; y <= namesArray[x].length()-1 ; y++) {
                System.out.print(namesArray[x].charAt(y)+"-->");
            }
            System.out.println();
        }



    }
}
