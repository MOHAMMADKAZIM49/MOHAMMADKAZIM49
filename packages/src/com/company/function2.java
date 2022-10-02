package com.company;
import java.util.Scanner;
public class function2 {
    public static int addSum(int Sum){
        System.out.println("The sum of two number is;");
        System.out.println(Sum);
        return 1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num1:");
        int num1 = sc.nextInt();
        System.out.print("Enter the value of num1:");
        int num2 = sc.nextInt();
        int Sum = num1 +num2;
        addSum(Sum);
    }
}
// Same program anther method to written is
//package com.company;
//import java.util.Scanner;
//public class function2 {
//    public static int calculateSum(int a, int b){
//        System.out.println("The sum of two number is;");
//         int sum = a+ b;
//        return sum;
//    }
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the value of num1:");
//        int num1 = sc.nextInt();
//        System.out.print("Enter the value of num1:");
//        int num2 = sc.nextInt();
//        int sum = calculateSum(a,b);
//         System.out.println("sum);
//    }
//}