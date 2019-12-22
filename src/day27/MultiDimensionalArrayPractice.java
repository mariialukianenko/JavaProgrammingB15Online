package day27;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {
    public static void main(String[] args) {


        String [][] names = { {"MAriia", " Valentina"} , {"Illia", "Alexandr"} };

        System.out.println(names[1][0]);

        names[1][0] = "George";
        System.out.println(names[1][0]);

        System.out.println(Arrays.toString(names[1]));
        System.out.println(Arrays.deepToString(names));


        int[][] numbers = { {1, 2, 3} , {4, 5, 6} , {7, 8, 9} };

        System.out.println(Arrays.toString(numbers[0]));
        System.out.println(Arrays.toString(numbers[1]));
        System.out.println(Arrays.toString(numbers[2]));
        System.out.println("-----------------------");
        for (int i = 0; i <= numbers.length-1 ; i++) {
            System.out.println(Arrays.toString(numbers[i]));
        }

        System.out.println();
        System.out.println("-----------------------");
        for (int x = 0; x <= numbers.length-1 ; x++) {
            for (int y = 0; y <= numbers[x].length-1 ; y++) {
                System.out.print(numbers[x][y]+" ");

            }
        }

        System.out.println();
        System.out.println("-----------------------");
        int[][] ages = { {10} , {12, 13, 14, 16, 17} , {19, 20, 21, 22, 23} };

        for (int k = 0; k <= ages.length-1 ; k++) {
            for (int l = 0; l <= ages[k].length-1 ; l++) {
                if (ages[k][l] %2 == 0 ){
                    System.out.print(ages[k][l] + " ");

                }
            }
        }
        System.out.println();
        System.out.println("-----------------------");

        int [][] arr2D = {{10, 20, 30},{40, 50, 60, 70, 80, 90, 100} };
        for ( int[] each1DArray  : arr2D  ){
            for (int eachElement : each1DArray){
                System.out.print(eachElement+ " ");
            }
        }





    }
}
