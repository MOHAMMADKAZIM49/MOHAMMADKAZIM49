package com.company;
import java.sql.SQLOutput;
import java.util.*;
public class kwh_pactice1_ch {
    public static void main(String[] args) {

        //exercise1.1 problem

//        Write a program to calculate the percentage of a given student in the CBSE
//        board exam. His marks from 5 subjects
//        must be taken as input from the keyboard. (Marks are out of 100)

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of physics");
        int physics=sc.nextInt();
        System.out.println("Enter the marks of Math");
        int math=sc.nextInt();
        System.out.println("Enter the marks of Chemistry");
        int chemistry=sc.nextInt();
        System.out.println("Enter the marks of Hindi");
        int hindi=sc.nextInt();
        System.out.println("Enter the marks of English");
        int english=sc.nextInt();
        int totalSum=physics+math+chemistry+hindi+english;
       double totaloutofmarks=100+100+100+100+100;
       // double totaloutofmarks=500;
        System.out.println("the sum of the  total number is:"+totalSum);
        double percentage= (totalSum/totaloutofmarks) * 100;
        System.out.println("The percentage is:"+percentage);
        float average = totalSum/5;
        System.out.println("The average is:" +average);


       // practice set  problem

        //problem1

       //  1.  Write a program to sum three numbers in Java.

//        int a=6;
//        int b=4;
//        int c=5;
//        int sum=a+b+c;
//        System.out.println("the sum of number is:"+sum);

        // problem2

      // 2. Write a program to calculate CGPA using marks of three subjects (out of 100)


//        float  marks1=45;
//        float marks2=50;
//        float marks3=60;
//        float CGPA=(marks1+marks2+marks3)/30;
//        System.out.println("The CGPA of number is:"+CGPA);

        // problem3


    //  3.  Write a Java program that asks the user to enter his/her name and greets
    //    them with “Hello <name>, have a good day” text.

//        Scanner sc=new Scanner(System.in);
//         System.out.println("Enter your name:");
//         String name =sc.nextLine();
//        System.out.println("Hello " +name+ " have a good day! ");

        // problem4

      //  4.   Write a Java program to convert Kilometers to miles.


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your kilometer value:");
//        double kilometer = sc.nextDouble();
//        System.out.println("The kilometer of " +kilometer+ "is converted " +
//                "value in miles are " +kilometer/1.609344);

        // converted miles to kilometer

//        System.out.println("Enter your miles value:");
//        double miles = sc.nextDouble();
//        System.out.println("The miles of " +miles+ "is converted " +
//                "value in miles are " +miles/0.621371);


                // problem5

       //  5. Write a Java program to detect whether a number entered by
        //  the user is an integer or not.


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your number:");
//        boolean itIsInteger = sc.hasNextInt();
//     //   System.out.println(sc.hasNextInt());
//
//
//        if (itIsInteger) {
//                System.out.println("It is an integer.");
//        } else {
//            System.out.println("It is not  an integer.");
//
//        }
    }
}
