//Take an array as input from the user .Search for a given number xnd print  the index at which it occurs.
package com.company;
import java.util.Scanner;
public class array3 {
    public static void main(String args[]) {
        System.out.print("Enter the size of array:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

//        input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        int x = sc.nextInt();
//        output
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println("x found at index :" + i);
            }
        }
    }
}
