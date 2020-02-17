package day33;

public class MethodWithReturnDOBWillReturnAge {
    public static void main(String[] args) {

        System.out.println(calculateAmdReturnAge(1995));
        System.out.println(calculateAmdReturnAge(2020));

        System.out.println();

        int[] birthArray = {1999, 122, 2019, 1987, 1964, 2004};
        for (int i = 0; i <=birthArray.length-1 ; i++) {
            System.out.println(calculateAmdReturnAge(birthArray[i]));
        }


    }
    public static int calculateAmdReturnAge (int age){

        int yourAge = 0;
        if (age >= 1900 && age<=2019){
            yourAge = 2019 - age;
            return yourAge;
        }else{
            return 0;
        }
    }

}
