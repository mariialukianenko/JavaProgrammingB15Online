package day27;

import java.util.Arrays;

public class Multi_Dimensional_Arrays {
    public static void main(String[] args) {

        /*
        Single dimensional array : contain values
        int [] arr = {1, 2, 3};
        -------------------------
        Multi-dimensional array :  array can contain another array or arrays
        N dimensional array contains N-1 dimensional arrays


         */

        int [] arr1D = {1, 2, 3};  // this is single
                  //        0  1  2     0  1  2
        int [][] arr2D = { {1, 2, 3} , {4, 5, 6} };
                  //   index   0           1
        //     [index num of 1D arrays] and second one [index num of elements]

        System.out.println(arr2D.length);
        System.out.println(Arrays.toString(arr2D[0]));
        System.out.println(Arrays.toString(arr2D[1]));   // return whole array

        System.out.println(arr2D[0][2]);  // return just one value
        System.out.println(arr2D[1][1]);

        System.out.println(Arrays.toString(arr2D)); // not working. working just with single array

        System.out.println(Arrays.deepToString(arr2D));

    }
}
