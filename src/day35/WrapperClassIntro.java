package day35;

public class WrapperClassIntro {
    public static void main(String[] args) {

        int x = 10;
        // primitive data type are pure value has no attribute or behavior


        // each primitive type has wrapper class that turn it into object so we can treat it
        Integer x1 = new Integer(12); // --> nit recommended way of create Integer Object

        Integer x2 = Integer.valueOf(10);
        Integer x3 = Integer.valueOf("10");

        byte bValue = x2.byteValue();
        System.out.println(bValue);


        }

    }

