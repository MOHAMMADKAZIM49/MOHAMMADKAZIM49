//Example of table print using for loop.
package com.company;
import java.util.Scanner;
public class tableexample {
        public static void main(String[]args){
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Enter the number num value :");
                    int num = sc.nextInt();
                    System.out.println("Multiplication table is :");
                    for (int i=1;i<=10;i++) {
                        System.out.println(num +" x " + i + " = " +(num*i));
            }
        }
    }


