package day37;

import java.util.ArrayList;
import java.util.List;

public class ListPracticeWithLoop {
    public static void main(String[] args) {
        
        // set = replace, change!!!
        // add = add, insert!!!

        // create arraylist and fill it up with 1-100

        List<Integer> nums = new ArrayList<>();

        for (int i = 1; i <=100 ; i++) {
            nums.add(i);
        }
        System.out.println(nums);

        // change all the odd number value to 0
        for (int x = 0; x <= nums.size()-1 ; x = x+2) {
            nums.set(x, 0);
        }
        System.out.println(nums);

        // insert 100 to first index:
        nums.add(0,100);
        System.out.println(nums);

        
        // how to find index of 20
        System.out.println("nums.indexOf(20) = " + nums.indexOf(20));


        // task. insert 100 right after 34: we do not know where is 34
        List<Integer> lst2 = new ArrayList<>();
        lst2.add(44);
        lst2.add(14);
        lst2.add(34);
        lst2.add(41);
        lst2.add(19);

        lst2.add(lst2.indexOf(34)+1, 100);
        System.out.println(lst2);

        // add five 500 in front of 44
        for (int i = 0; i < 5 ; i++) {   // or i=1 : i <= 5
            lst2.add(0,100);
        }
        System.out.println(lst2);

    }
}
