package com.company;
import java.util.Scanner;
public class leapyeranothermethod2 {
    public static void main(String args[]) {
        String yn;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the year:");
            int year = sc.nextInt();
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println("It is a leap year");
                    } else {
                        System.out.println("It is not a leap year");
                    }
                } else {
                    System.out.println("It is a leap year");
                }
            } else {
                System.out.println("It is not a leap year");
            }
            System.out.println("Do you want to continue (Press y for Yes and n for No)");
            yn = sc.next();
        } while(yn.equals("y")||yn.equals("Y"));
        }
    }
