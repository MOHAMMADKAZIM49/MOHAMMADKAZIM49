//floyd`s triangle number question
package com.company;
import java.util.Scanner;
public class pattern8 {
    public static void main(String args[]){
         System.out.print("Enter the value of n:");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int number =1;
//        outer loop
        for( int i=1;i<=n;i++){
//            inner loop
            for( int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++; //number=number+1
            }
            System.out.println();
        }
    }
}
//taken n=5 print like this
//1
//2 3
//4 5 6
//7 8 9
//7 8 9 10
//11 12 13 14 15
//for inverted print
////we change outer loop code
////for(int i=n; i>=1; i--) now print like this
////1 2 3 4 5
////6 7 8 9
////10 11 12
////13 14
////15
////        another method for printed inverted loop
////        inner loop
////            for(int j=1;j<n-i+1;j+)