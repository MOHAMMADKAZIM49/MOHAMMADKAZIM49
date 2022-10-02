// find the factorial of number.
package com.company;
import java.util.Scanner;
public class funcion3factorial {
   public static void calculateFactorial(int n) {
       System.out.println("The factorial of given  number is");
       if(n<0){
           System.out.println("Invalid input");
           return;
       }
    int factorial = 1;
    for(int i = n; i>=1; i--){


        factorial = factorial * i;
    }
         System.out.println(factorial);
     return;
    }
    public static void main(String args[]) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        calculateFactorial(n);
    }
}
// function call direcly but method call by class ke obect se.0


