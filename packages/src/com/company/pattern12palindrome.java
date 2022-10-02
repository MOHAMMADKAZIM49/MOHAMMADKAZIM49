//palindrome pattern question+
package com.company;
import java.util.Scanner;
public class pattern12palindrome {
    public static void main(String args[]) {
        System.out.print("Enter the value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//                outer loop
        for (int i = 1; i <= n; i++) {
//            spaces print
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
//            1st half number
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

//            2nd half number
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
//taken n=5 print like this
//    1
//   212
//  32123
// 4321234
//543212345