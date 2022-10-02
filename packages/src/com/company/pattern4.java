package com.company;
import java.util.Scanner;
public class pattern4 {
    public static void main(String args[]){
        System.out.print("Enter the value of n:");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
//        outer loop
        for (int i=1;i<=n;i++){
//            inner loop -->space print.
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //            inner loop -->star print.
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//taken n=4 print like this
//   *
//  **
// ***
//****
//for inverted print
//we change outer loop code
//for(int i=n; i>=1; i--) now print like this
//****
// ***
//  **
//   *