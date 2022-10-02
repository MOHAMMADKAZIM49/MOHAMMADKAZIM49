//pattern example rectangle
package com.company;
import java.util.*;
public class pattern1example {
        public static void main(String args[]) {
            System.out.print("Enter the value of n:");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.print("Enter the value of m:");
            int m = sc.nextInt();
//        outer loop
            for (int i=1; i<= n; i++) {
//            inner loop
                for (int j=1; j<= m; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
//taken n=4 and m=5 print like this
// *****
// *****
// *****
// *****

