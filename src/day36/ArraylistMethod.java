package day36;

import day06.UsingTheValueOfOtherVariable;

import java.util.ArrayList;

public class ArraylistMethod {
    public static void main(String[] args) {
        // create srraylist object of long and assign it to a variable

        ArrayList<Long> lst = new ArrayList<>();
        
      // C R U D     create  read  update  delete
        
        lst.add(12L);  // 12L is automatically converted to new Long(12L); because arraylist only store object
        lst.add(100L);
        lst.add(200l);

        System.out.println("lst = " + lst);

        System.out.println("counting items -->  " + lst.size());

        System.out.println("first item is "+lst.get(0));



        // Task: get the sum of above arraylist item
        long sum = 0L;
        for (int i = 0; i <= lst.size()-1 ; i++) {
            sum = sum + lst.get(i);
        }
        System.out.println("sum = " + sum);



        // task get the max
        long max = lst.get(0);
        for (int x = 0; x < lst.size(); x++) {
            if (lst.get(x) > max){
                max = lst.get(x);
            }
            System.out.println("max = "+max);
        }


        // task
        // i want to insert 150 between 100 and 200
        lst.add(2,150L);
        System.out.println("lst after insert 150 = " + lst);


        //task. updaiting value at certain index : set method
        lst.set(3,195L);
        System.out.println(lst.get(3));
        System.out.println(lst);


        // removing item by it's value
        lst.remove(100L);
        System.out.println("after removing 100: "+lst);

        //remove item by it's index
        lst.remove(2);
        System.out.println(lst);

        System.out.println("location of 150: "+ lst.indexOf(150L));

        System.out.println("check if this arraylist is empty: " + lst.isEmpty());
        System.out.println(lst.size() > 0);


        // how to delete everything
        lst.clear();
        System.out.println("check if this arraylist is empty after clearing: " + lst.isEmpty());
    }
}
