//number pyramid problem
package com.company;
import java.util.Scanner;
public class pattern11numberpyramid {
    public static void main(String args[]){
        System.out.println("Enter the value of n:");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
//        outer loop
        for(int i=1; i<=n; i++){
//            int number=1;
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
                }
//            numbers print row numer row number times becase we print i
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
//taken n=5 print like this
//    1
//   2 2
//  3 3 3
// 4 4 4 4
//5 5 5 5 5