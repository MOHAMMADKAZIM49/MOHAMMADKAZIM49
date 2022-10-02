package com.company;
import java.util.*;
public class condition {
        public static void main(String[]args){
            System.out.print("Given your age:");
            Scanner sc = new Scanner(System.in);
            int age = sc.nextInt();
            if(age>18){
                System.out.println(" You are Adult");
            } else {
                System.out.println(" You are Not Adult");
            }
        }
    }

