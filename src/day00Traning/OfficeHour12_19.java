package day00Traning;

import java.util.Arrays;

public class OfficeHour12_19 {
    public static void main(String[] args) {

        // chec if a string is build out of the same letters as another string

        String str1 = "abc", str2 = "cba";

       char[] arr1 =  str1.toCharArray();
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);  //  [ a, b, c]

        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

      str1 =   Arrays.toString(arr1);
      str2 = Arrays.toString(arr2);
        System.out.println(str1.equals(str2));

        System.out.println("===============");

        // task2
        // write program that will remove all the duplicate from a string. Do it with arrays.

        String s1 = "aaabbaaccbbdd";          // --> "abcd

        String s2 = "";   // we store non duplicated character in it

        for (int i = 0; i <= s1.length()-1 ; i++) {

            String eachChar = "" +s1.charAt(i);

            if (!s2.contains(eachChar)){
                s2 = s2 + eachChar;
            }
        }
        System.out.println(s2);

        System.out.println("------------");
        // solution 2. with array
        String fiveMinutes = "abcabcddffbvcbvhjh";
       String [] eachLetter  = fiveMinutes.split("");

       String result = "";
       for (String  each   :  eachLetter){
           if (!result.contains(each)){
               result = result + each;
           }
       }
        System.out.println(result);

    }
}
