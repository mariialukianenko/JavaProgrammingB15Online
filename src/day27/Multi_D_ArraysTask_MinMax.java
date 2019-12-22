package day27;

public class Multi_D_ArraysTask_MinMax {
    public static void main(String[] args) {

        int [][] numbers = { {12, 11, 10, 19} , {19, 20, 15} };
        int max = numbers[0][0];

        for (int x = 0; x <= numbers.length-1 ; x++) {
            for (int y = 0; y <= numbers[x].length-1 ; y++) {
                if (max < numbers[x][y]){
                    max = numbers[x][y];
                }
            }
        }
        System.out.println(max);

        System.out.println("==============");
        int max2 = numbers[0][0];
        for (int[] each1DArray : numbers){
            for ( int eachElement : each1DArray){
                if (max2 < eachElement) {
                    max2 = eachElement;
                }
            }
        }
        System.out.println(max2);

        System.out.println("==============");
        int min = numbers[0][0];
        for (int[] each1DArray : numbers){
            for ( int eachElement : each1DArray){
                if (min > eachElement) {
                    min = eachElement;
                }
            }
        }
        System.out.println(min);



    }
}
