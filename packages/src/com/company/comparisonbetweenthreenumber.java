package com.company;
import java.util.Scanner;
public class comparisonbetweenthreenumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number num1:");
        int num1 = sc.nextInt();
        System.out.print("Enter the first number num2:");
        int num2 = sc.nextInt();
        System.out.print("Enter the first number num3:");
        int num3 = sc.nextInt();
        if (num1 > num2 && num1 > num3)
        {
            System.out.println("num1 is greater number");
        }
        else if ((num2 > num1) && (num2 > num3))
        {
            System.out.println("num2 is greater number");
        }
        else
            {
            System.out.println("num3 is greater number" );
            }
    }
}
