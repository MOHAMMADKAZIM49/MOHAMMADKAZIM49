//Print a given name in function
package com.company;
import java.util.Scanner;
public class function {
    public static void printMyName(String name){//camelCase me name ko declare kiya hoo
        System.out.println("Entered input String number output is:");
        System.out.println(name);
        return ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name =sc.next();
        printMyName(name);//call kiya function ko

    }
}
