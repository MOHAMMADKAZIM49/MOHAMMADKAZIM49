//butterfly pattern questition
package com.company;
import java.util.Scanner;
public class advancepattern10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n =sc.nextInt();
//        int n=5; in3no line ke jagah ye bhi likh sakte hai
//         upper half
        for (int i=1; i<=n; i++) {
//            first part print
            for (int j=1; j<= i; j++) {
                System.out.print("*");
            }

//             print spaces
            int spaces = 2 *(n - i);
            for (int j=1; j<=spaces; j++) {
                System.out.print(" ");
            }
//            2nd part star print
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
//        lower half first half part
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //        lower half spaces half part
            int spaces =2*(n-i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            //        lower half second  half part star print
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//taken n=5 print like this
//*        *
//**      **
//***    ***
//****  ****
//**********
//**********
//****  ****
//***    ***
//**      **
//*        *



