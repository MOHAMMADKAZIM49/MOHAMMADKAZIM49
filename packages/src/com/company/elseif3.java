//elseif condition use to print days of week
package com.company;
import java.util.*;
public class elseif3 {
    public static void main(String args[]) {
        System.out.print("Enter the button :");
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        if (button == 1)
        {
            System.out.println("Monday");
        }
        else if (button == 2)
        {
            System.out.println("Tuesday");
        }
        else if (button == 3)
        {
            System.out.println("Wednesday");
        }
        else if (button == 4)
        {
            System.out.println("Thursday");
        }
        else if (button == 5)
        {
            System.out.println("Friday");
        }
        else if (button == 6)
        {
            System.out.println("Saturday");
        }
        else if (button == 7)
        {
            System.out.println("Sunday");
        }
        else{
            System.out.println("invalid input");
        }
    }
}
