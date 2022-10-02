package com.company;

public class PractisePatternTriangel {
    public static void main(String args[]) {
        int n = 5;
//       for row
        for (int i = 1; i <= n; i++) {
//            print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }


//            print row no row no times
            for (int k = 1; k <= i; k++) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
