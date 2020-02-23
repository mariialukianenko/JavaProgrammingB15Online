package day00Traning;

public class office_hour_01_03 {
    public static void main(String[] args) {

        String str = "AAABBBDDDEEE";  // expected result: ABCD
        String result1 = "";  // store non duplicate

        for (int i = 0; i <= str.length()-1 ; i++) {
            if (!result1.contains(str.substring(i, i + 1))) {   // (""+str.charAt(i))  --> we can do this way

                result1 = result1 + str.substring(i, i + 1);
            }
        }

        System.out.println(result1);

        System.out.println(removeDup("AAFFFHHYTTRYU"));
        System.out.println(frequency("AADFGACFA", 'A'));

        frequenvyOfCharacters("AABBBCCC");
    }

    public static String removeDup(String str){

        String result1 = "";

        for (int i = 0; i <= str.length()-1 ; i++) {
            if (!result1.contains(str.substring(i, i + 1))) {

                result1 = result1 + str.substring(i, i + 1);
            }
        }

        return result1;

    }

    //Task2:   frequency("AAABBB" , 'B')  --> 3

    public static int frequency (String str, char ch){

        int count = 0;

        char[] arr = str.toCharArray();
        for (char eachChar : arr){
            if (ch == eachChar){
                count++;
            }
        }

        return count;
    }

    //Task 3: "AAABBBCCC"  --> A3B3C3. Combine first and second method
                               // ABC
                               // A3B3C3
    public static void frequenvyOfCharacters(String str){   // example "AAABBBCCC"

        String nonDup = removeDup(str); //ABC

        for (int y = 0; y <= nonDup.length()-1 ; y++) {
            int count = frequency(str, nonDup.charAt(y)); // 3
            System.out.print( "" + nonDup.charAt(y) + count );
                                   // 'A' + 3

            // also we can do it with return method
        }

    }
}
