//package com.company;
//import java.util.Scanner;
//public class functionmultiply {
//    public static int calculateMultiply(int a, int b) {
//        System.out.println("The multiply of two number is;");
//        int mul = a * b;
//        return mul;
//    }
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the value of a :");
//        int a = sc.nextInt();
//        System.out.print("Enter the value of  b :");
//        int b = sc.nextInt();
//        int mul = calculateMultiply(a, b);
//        System.out.println(mul);
//    }
//}


// It cn be written as same program like this
//
package com.company;
import java.util.Scanner;
public class functionmultiply {
    public static int calculateMultiply(int a, int b){
        return a * b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a :");
        int a = sc.nextInt();
        System.out.print("Enter the value of  b :");
        int  b = sc.nextInt();
        int mul = calculateMultiply(a,b);
         System.out.print("the product of two number is :" +calculateMultiply(a,b));
    }
}
