package com.company;
import java.util.*;
public class circlearea {
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.print("enter the radius:");
            int radius = sc.nextInt();
            double pi = 3.14,area;
             area = pi*radius*radius;
            System.out.println("Area of a circle:"+area);
        }
    }


