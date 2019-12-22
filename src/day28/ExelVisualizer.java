package day28;

import java.util.Arrays;

public class ExelVisualizer {
    public static void main(String[] args) {

     //   { {78,54,100,84},{33,44,77,123},{12,88,52,76},{67,33,98,67},{12,33,52,45},{67,33,98,34} };


        int [] row1 = new int[] {78, 54, 100, 84};
        int [] row2 = new int[] {33, 44, 77, 123};
        int [] row3 = new int[] {12, 88, 52, 76};
        int [] row4 = new int[] {67, 33, 98, 67};
        int [] row5 = new int[] {12, 88, 52, 45};
        int [] row6 = new int[] {67, 33, 98, 34};

       // int [][] sheet = new int[][] { {78,54,100,84},{33,44,77,123},{12,88,52,76},{67,33,98,67},{12,33,52,45},{67,33,98,34} };
        int [][] sheet = {   row1, row2, row3, row4, row5, row6   };

        int [][] myExel = {   { 10, 27 }, { 87, 99, 100 }  , { 90, 45  }    };
        System.out.println(myExel[1][2]);

        System.out.println(myExel.length);
        System.out.println(myExel[0].length);
        System.out.println(Arrays.toString(myExel[0]));

        System.out.println("===================");
        // one line to see length of whole array(item count of each array). Use loop
        for (int x = 0; x <= myExel.length-1 ; x++) {
            System.out.println(myExel[x].length);
        }


        }
    }

