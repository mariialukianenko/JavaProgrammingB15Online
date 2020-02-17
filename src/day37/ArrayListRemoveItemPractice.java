package day37;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveItemPractice {
    public static void main(String[] args) {

        List<Integer> lst = new ArrayList<>();
        lst.add(44);
        lst.add(14);
        lst.add(34);
        lst.add(41);
        lst.add(19);
        System.out.println(lst);

        lst.remove(3);
        System.out.println(lst);

        lst.remove(2);
        System.out.println(lst);

       // lst.remove(new Integer(44));
        lst.remove(Integer.valueOf(44));
        System.out.println(lst);
    }
}
