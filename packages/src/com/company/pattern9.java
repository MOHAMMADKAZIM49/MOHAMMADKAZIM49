//0-1triangle
package com.company;
import java.util.Scanner;
public class pattern9 {
    public static void main(String args[]){
        System.out.print("Enter the value of n:");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
//        outer loop
        for(int i=1; i<=n; i++){
//            inner loop
            for( int j=1;j<=i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {   //for even
                    System.out.print(1);
                } else {   //for odd
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}
//taken n=5 print like this
//0
//0 1
//1 0 1
//0 1 0 1
//1 0 1 0 1