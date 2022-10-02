//Write a program to find the factorial value of any number entered through the keyboard.
package com.company;
import java.util.Scanner;
public class factorialnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//    int num; //to hold number
        int fact = 1; //to hold factorial
        System.out.print("Enter the number num value :");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++)
        {
            fact =fact * i;
        }
        System.out.println("Factorial of number  is :" + fact);
    }
}
//fact = fact*i; and fact* = i; are same.