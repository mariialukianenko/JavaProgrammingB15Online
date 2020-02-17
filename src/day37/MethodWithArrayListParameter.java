package day37;

import java.util.ArrayList;
import java.util.List;

public class MethodWithArrayListParameter {
    public static void main(String[] args) {

        List<String> nameLst = new ArrayList<>();
        nameLst.add("Mariia");
        nameLst.add("Illia");
        nameLst.add("Valentina");
        nameLst.add("Alexander");
        nameLst.add("Georg");
        nameLst.add("Irina");

        printAList(nameLst);

//        byte myByte = 17;
//        printByte(myByte);
    }

    public static void printByte (byte b){
        System.out.println(b);
    }



    // create a method that accept a List of String as argument
    // and print out each and every item in the list vertically
    public static void printAList( List<String> lst){
        for (String each : lst) {    // iter --> shortcut
            System.out.println(each);
        }
    }
}
