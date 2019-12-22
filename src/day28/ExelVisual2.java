package day28;

import java.util.Arrays;

public class ExelVisual2 {
    public static void main(String[] args) {


        int [][] myExel = {
                                 { 10, 27, 88, 99 }, // this is first 1D array
                                 { 87, 100 },       // this is second 1D array
                                 { 90, 45, 65 }    // this is third 1D array
                          };
        System.out.println(Arrays.deepToString(myExel));

        for (int[]  eachRow :   myExel){
            for (int  eachCell : eachRow ){
                System.out.print(eachCell+" ");
            }
            System.out.println();
        }





        }
    }

