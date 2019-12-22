package day25;

import java.util.Arrays;

public class StringToCharArrayMethod {
    public static void main(String[] args) {

        String name = "Alesya";

        char [] namesChar = new char[name.length()];
       // namesChar[0] = name.charAt(0); // it is manually
        for (int x = 0; x <= namesChar.length-1 ; x++) {
            namesChar[x] = name.charAt(x);
        }
            System.out.println(Arrays.toString(namesChar));
        
        char [] namesChar2 = name.toCharArray();
        System.out.println("Arrays.toString(namesChar2 = " + Arrays.toString(namesChar2));


        System.out.println("=======================");

        String myName = "Mariia";
        int count = 0;
        char [] myNameChar = myName.toCharArray();

        for ( char  eachChar :  myNameChar ) {
            System.out.println(eachChar);
            if (eachChar=='a'){
                count++;
            }
        }
        System.out.println("a = "+count);


        }
    }

