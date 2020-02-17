package day37;

import java.util.ArrayList;
import java.util.List;

public class MethodWithArrayListAsReturnType {
    public static void main(String[] args) {

        System.out.println(getListFrom1TillFinalNumber(7));

        List<Integer> myList = getListFrom1TillFinalNumber(25);
        System.out.println(myList);

    }
    // create a method that eccept a finalNumber as int
    // return ArrayList of Integer containing numbers
    // starting from 1 to finalNumber
    public static List<Integer> getListFrom1TillFinalNumber(int finalNumber){
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= finalNumber ; i++) {
            nums.add(i);
        }
        return nums;
        }
    }

