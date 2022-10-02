package com.company;
import java.util.*;
public class elseif {
        public static void main(String[] args) {
            System.out.print("enter the number a :");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            System.out.print("enter the number b: ");
            int b = sc.nextInt();
            if (a == b) {
                System.out.println("a is equal to b");
            } else if (a > b) {
                System.out.println("a is greater");
            }
            else {
                System.out.println("b is greater");
            }
        }
    }


