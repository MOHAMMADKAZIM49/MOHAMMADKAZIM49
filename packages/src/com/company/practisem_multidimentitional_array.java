package com.company;

public class practisem_multidimentitional_array {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3,}, {4, 5, 6}};
        int[][] arr2 = {{7, 8, 9}, {10, 11, 12}};
         int[][] result = {{0, 0, 0}, {0, 0, 0}};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
             // System.out.println(result[i][j] + " ");


               System.out.println("");
              System.out.println("result[" + i + "][" + j + "] = " + result[i][j]);


            }

        }
    }
}

//  OUTPUT are 2D array
//        result[0][0] = 8
//        result[0][1] = 10
//        result[0][2] = 12
//        result[1][0] = 14
//        result[1][1] = 16
//        result[1][2] = 18
     //  Process finished with exit code 0
