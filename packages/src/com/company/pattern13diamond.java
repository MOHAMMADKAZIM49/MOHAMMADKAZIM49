package com.company;
import java.util.Scanner;
public class pattern13diamond {
    public static void main(String args[]) {
        System.out.print("Enter the value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//                outer loop
        for (int i = 1; i <= n; i++) {
//            spaces print
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
//            for (int j = 1; j <= 2 * i - 1; j++) {
//                System.out.print("*");

//            first half part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
//            second half part
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
//        lower part
        for (int i = n; i >= 1; i--) {
//            spaces print
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
//             lower first half part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
//           lower second half part
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//for this both for loop lower half part and lower second half part we can write this
//    lower first half part
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
////           lower second half part
//            for (int j = 2; j <= i; j++) {
//                System.out.print("*");
//            }
//we can this same output is given   for (int j = 1; j <= 2 * i - 1; j++) {
////                System.out.print("*");
//taken n=4 print like this
//   *
//  ***
// *****
//*******
//*******
// *****
//  ***
//   *
