package day27;

import java.util.Arrays;

public class MultiDimension3D {
    public static void main(String[] args) {

        int [][][] arr3D = {  {{1, 2, 3} , {4, 5, 6}}   ,   {{7, 8, 9} , {10, 11, 12}}    };

        System.out.println(arr3D[1][0][2]);  // ---->  9
        System.out.println(Arrays.toString(arr3D[0][0]));
        System.out.println(Arrays.deepToString(arr3D[0]));
        System.out.println(Arrays.deepToString(arr3D));

        for (int i = 0; i <= arr3D.length-1 ; i++) {
            for (int j = 0; j <= arr3D[i].length-1 ; j++) {
                for (int k = 0; k <= arr3D[i][j].length-1 ; k++) {
                    System.out.print(arr3D[i][j][k]+" ");   // return value
                }
            }
        }

        // convert the nested loop to the nested for each
        System.out.println();
        System.out.println("=========================");
        for ( int[][] each2D :  arr3D ){
            for (int [] each1D :   each2D){
                for (int eachElement :  each1D){
                    System.out.print(eachElement+", ");
                }
            }
        }



    }
}
