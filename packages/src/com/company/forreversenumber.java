//Write a program that prompts the user to input an integer and then output the number with the digit reversed.
// For example, if the input is 12345, the output should be 54321.
package com.company;
import java.util.Scanner;
public class forreversenumber {
    public static void main(String args[]){
       Scanner console =new Scanner(System.in);
       int number;
       int reverse=0;
        System.out.print("Enter the number:");
       number = console.nextInt();
       int temp= number;
       int remainder= 0;
       while(temp>0)
       {
           remainder= temp %10;
           reverse =reverse*10 +remainder;
           temp/= 10;
       }
        System.out.println("reverse of:  " +number+ "  is  " +reverse);
       }

    }

