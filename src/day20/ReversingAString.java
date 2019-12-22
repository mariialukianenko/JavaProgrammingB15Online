package day20;

public class ReversingAString {
    public static void main(String[] args) {

        //given a string variable name with value, reverse this name and store value into another string

        String name = "Jon Snow";
        String reversrName = "";

//        System.out.println(name.charAt(7));
//        System.out.println(name.charAt(6));
//        System.out.println(name.charAt(5));
//        System.out.println(name.charAt(4));
//        System.out.println(name.charAt(3));

        //int lastCharIndex = name.length() - 1;   // take the last index

        for (int x = name.length() - 1; x >= 0; x--) {
            System.out.print(x + " index: ");

            System.out.println(name.charAt(x));

            reversrName = reversrName + name.charAt(x);

        }
        System.out.println(reversrName);


        //shorter version
        // for (int i = name.length()-1; i>=0; i--){
        // System.out.println(i);
        // reversName = reverseName + name.CharAt(i);
        // }
    }
}
