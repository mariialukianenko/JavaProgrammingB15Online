package day36;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListIntro {

    // unlike array, it is resizeble.

    public static void main(String[] args) {

        ArrayList<String> lst1 = new ArrayList<>();

       // ArrayList<int> lst2 = new ArrayList<int>(); --> can not store primitive

        // correct way to create arraylist object that store whole number
        // is to use Wrapper class type.
        ArrayList<Integer> lst2 = new ArrayList<>();

        ArrayList<Long> lst3 = new ArrayList<>();

        ArrayList<Double> lst4 = new ArrayList<>();

        //optionally you can create in this way
        List<String> myLst = new ArrayList<>();

    }
}


