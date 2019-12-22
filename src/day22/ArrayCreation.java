package day22;

public class ArrayCreation {
    public static void main(String[] args) {
        
        int[] ages = new int[]{20, 22, 24, 26};
       // ages = new int[]{20, 22, 24, 26};
        int itemCount = ages.length;

        System.out.println("itemCount = " + itemCount);

        for (int i = 0; i <=ages.length-1 ; i++) {
            if (i<ages.length-1) {
                System.out.print(ages[i] + ", ");
            }else
                System.out.print(ages[i]);


        }

        System.out.println();
        System.out.println("-------------------");
        int[] areaCode = {952, 900, 665};
        for (int i = 0; i <= areaCode.length-1 ; i++) {
            System.out.print(areaCode[i]+ " ");
        }

    }
}
