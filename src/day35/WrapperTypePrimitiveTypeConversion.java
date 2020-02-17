package day35;

public class WrapperTypePrimitiveTypeConversion {
    public static void main(String[] args) {

        Integer num1 = 100; //--> auto-boxing 100 --> new Integer(100)

        int num2 = Integer.valueOf("200"); // -> auto-unboxing into 200

        int num3 = Integer.parseInt("200");

        // IPR2012-00001
        String caseNumber = "IPR2012-00001";
        int year;  // --> get 2012 out of it

        String strYear = caseNumber.substring(3,7);
        year = Integer.parseInt(strYear);
        System.out.println(year);

        // test code
        System.out.println(getYearOutOfCaseNumber("DER2019-00034"));



    }
    public static int getYearOutOfCaseNumber (String caseNumber){

        int year;

//        String strYear = caseNumber.substring(3,7);
//        year = Integer.parseInt(strYear);
//        return year;

        return Integer.parseInt(caseNumber.substring(3,7));

    }
}
