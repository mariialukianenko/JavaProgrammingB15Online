package day00Traning;

import java.util.Arrays;

public class OfficeHoure_12_30 {
    public static void main(String[] args) {

        // Auto-boxing: assigning primitive value to wrapper class
        // un=boxing: assign wrapper class value to primitive

        // all wrapper classes are prented in "java.land"

        Integer num1 = 100;
        double num2 = num1;
        System.out.println(num2);

        float f = 0.5f;
        Float fl = f;
        System.out.println(fl);

        System.out.println(Byte.MAX_VALUE);

        // parse method --> converting String value to primitives, returne primitive
        // valueOf -->  converting  String to Wrapper class, return Wrapper class

        String str1 = "123";
        int result = Integer.parseInt(str1);
        System.out.println(result+1);

        String str2 = "true";
        boolean r1 = Boolean.parseBoolean(str2);
        System.out.println(r1);

        // parse method not case sencetive
        String str3 = "FaLse";  // it is work
        boolean r2 = Boolean.parseBoolean(str3);
        System.out.println(r2);

        String s1 = "100.5";
        Double c1 = Double.parseDouble(s1);
        System.out.println(c1 + 1);    // it is call auto boxing
        Double c2 = Double.valueOf(s1); // this in not auto and not unboxing

        System.out.println(c1);
        System.out.println(c2);

        String s2 = "TrUe";
        Boolean b1 = Boolean.valueOf(s2);
        System.out.println(b1);  // no sensetive

        Double [] arr = new Double[3];
        System.out.println(Arrays.toString(arr));
        // default value of wrapper class always --> null, null, null

        String name = "string";
        String name1 = new String("string");

        Integer I1 = new Integer("123");

        System.out.println(addNum(12,13));
        System.out.println(addNum(15.3,7.4));
        
        }


        public static int addNum (int a, int b){

        return  a + b;
        }
        public static double addNum(double a, double b){
        return  a+b;
        }
    }

