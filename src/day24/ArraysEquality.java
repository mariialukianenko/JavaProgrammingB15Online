package day24;

import java.util.Arrays;

public class ArraysEquality {
    public static void main(String[] args) {

        int [] scores1 = {2, 5, 6, 7, 3, 34, 6};
        int [] scores2 = {23, 55, 66, 77, 37, 349, 68};
        int [] scores3 = {2, 5, 6, 7, 3, 34, 6};
        System.out.println(scores1==scores2);
        System.out.println(scores1==scores3);

        System.out.println(Arrays.equals(scores1, scores2));
        System.out.println(Arrays.equals(scores1, scores3));

        boolean isS1S2equals = Arrays.equals(scores1,scores2);
        System.out.println(isS1S2equals);
        boolean isS1S3equals = Arrays.equals(scores1,scores3);
        System.out.println(isS1S3equals);
    }
}
