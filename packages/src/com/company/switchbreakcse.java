package com.company;
import java.util.*;
public class switchbreakcse {
        public static void main(String args []){
            System.out.println("Enter the button:");
            Scanner sc = new Scanner(System.in);
            int button = sc.nextInt();
            switch(button){
                case 1 :System.out.println("Hello");
                    break;
                case 2 :
                    System.out.println("Namaste");
                    break;
                case 3 :
                    System.out.println("Bounjour");
                    break;
                default :
                    System.out.println("invalid Button");
            }
        }
    }


