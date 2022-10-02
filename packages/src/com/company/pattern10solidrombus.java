//solid rombus pattern questition
package com.company;
import java.util.Scanner;
public class pattern10solidrombus {
    public static void main(String args[]) {
        System.out.print("Enter the value of n:");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
//        outer loop
        for (int i = 1; i <= n; i++) {
//            spaces print
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
//            star print
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
//            NEW LINE print
            System.out.println();
        }
    }
}
//taken n=5 print like this
//    *****
//   *****
//  *****
// *****
//*****