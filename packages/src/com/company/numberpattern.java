// half pyramid and inverted half pyramid with number.
package com.company;
import java.util.Scanner;
public class numberpattern {
    public static void main(String args[]){
        System.out.print("Enter the value of n:");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
//        outer loop
        for(int i=1;i<=n;i++){
//            inner loop
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
//taken n=5 print like this
//1
//12
//123
//1234
//12345
//for inverted print
//we change outer loop code
//for(int i=n; i>=1; i--) now print like this
//12345
//1234
//123
//12
//1
//        another method for printed inverted loop
//        inner loop
//            for(int j=1;j<n-i+1;j++)