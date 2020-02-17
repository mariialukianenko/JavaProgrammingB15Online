package day34;

import day31.Calculator_V2;    ////  ---> call method from other package

import java.util.Arrays;

public class MathAction {
    public static void main(String[] args) {


        int result1 = WarmUpTask.build3DigitNumber(6,14,0);  // call method from other package
        System.out.println(result1);

        int[] nums = {2,5,87};
        System.out.println(Arrays.toString(nums));

        // How can I call static method called Calculator_V2 under day 31 package

        Calculator_V2.calculat('+',20, 5 ); // press calculate, than option + space to see inside
    }
}




