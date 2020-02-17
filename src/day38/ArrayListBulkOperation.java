package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListBulkOperation {
    public static void main(String[] args) {
        List<String> groceries = Arrays.asList("Eggs", "Milk", "Butter", "Apple", "Salmon");
        System.out.println(groceries);

        ArrayList<String> newLst = new ArrayList<>(groceries);
        newLst.add("Diet coke");
        newLst.add("Sugar");

        System.out.println(newLst);

        List<String> newItemToAdd = Arrays.asList("Pasta", "Spinach", "Asparangus", "Branzini");

        // Adding one list to another list
        // we want to add all items inside newItemToAdd ti newLst

        newLst.addAll(newItemToAdd);
        System.out.println(newLst);


        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(123);
        nums1.add(100);
        nums1.add(223);
        nums1.add(133);
        nums1.add(125);
        nums1.add(122);

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(2000);
        nums2.add(1000);

        nums1.addAll(nums2);
        System.out.println(nums1);
        System.out.println(nums2);

        // add to nums2 100, 200, 300, 400
        nums2.addAll(Arrays.asList(100, 200, 300, 400));
        System.out.println(nums2);
    }
}
