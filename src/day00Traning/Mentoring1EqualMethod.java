package day00Traning;

import java.util.Arrays;

public class Mentoring1EqualMethod {
    public static void main(String[] args) {

        int [] nums1 = {2, 4, 1, 34, 8};
        int [] nums2 = {2, 8, 1, 2, 8};
        Arrays.sort(nums1);
        System.out.println(Arrays.equals(nums1, nums2));
        System.out.println(Arrays.toString(nums1));

        boolean checIfArraysEqual = true;
        if (nums1.length != nums2.length){
            checIfArraysEqual = false;
            System.out.println("Arrays are not equal. Have different length.");
        }else{
            for (int i = 0; i <=nums1.length-1 ; i++) {
                if (nums1[i] != nums2[i]) {
                    checIfArraysEqual = false;
                    break;
                }
            }
            System.out.println("Not equal.");
        }
        System.out.println(checIfArraysEqual);

    }
}
