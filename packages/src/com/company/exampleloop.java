//the sum of n number
package com.company;
import java.util.Scanner;
public class exampleloop {
        public static void main(String[]args){
            System.out.print("Enter the value of n :");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int sum =0;
            for(int i=0; i<=n; i++){
                sum=sum+1;
            }
            System.out.println("the sum of number is:"+sum);
        }
}
//it can write three type all are correct amd give same output.
//sum=sum+1;
//sum+=i;
//sum++;