package com.company;
import com.sun.org.apache.xml.internal.serializer.OutputPropertyUtils;

import java.util.Scanner;
public class practise2 {
    public static void main(String[] args) {

        // METHOD 1 for array take user input
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the size of array:");
//        int size = sc.nextInt();
//        int marks[] = new int[size];
//        //        input ke liye
//        for (int i = 0; i < size; i++) {
//            marks[i] = sc.nextInt();
//        }
////        output ke liye
//
//        for (int i = 0; i < size; i++) {
//            System.out.println(marks[i]);
//
        //METHOD 2 for array

        //int []marks;     //Declaration
        //  marks= new int[5];  //memory allocation
//        int []marks= new int[5];    //Declaration + Memory allocation
//        marks[0]=1;      //Initialization
//        marks[1]=2;
//        marks[2]=3;
//        marks[3]=4;
//        marks[4]=5;
        //   System.out.println( marks[0]);

        //METHOD 3 for array


        // int[] marks = {6, 7, 8, 9, 1};
        //  System.out.println(marks[2]);
        // for (int i = 0; i < marks.length; i++) {

        //  for (int i = marks.length - 1; i >= 0; i--) {    //for reverse of array
        //   System.out.println(marks[i]);

        // BY FOR EACH LOOP

//        for(int element:marks){
////            System.out.println(element);
////            }


        // SUM OF ARRAY problem 1

//        int[] marks = {6, 7, 8, 9, 1};
//        int sum = 0;
//        for (int i = 0; i < marks.length; i++) {
//            sum = sum + marks[i];
//            System.out.println("THE value of sum is:" + sum);

            //OUTPUT  agar loop body ke ander print karao ge to iss tarah print hoga
//            THE value of sum is:6
//            THE value of sum is:13
//            THE value of sum is:21
//            THE value of sum is:30
//            THE value of sum is:31
//          OUTPUT  agar loop body ke bhahar print karao ge to iss tarah print hoga(print statement
//          loop body ke bahar likho)

//       //Output of the program is:

//            for (int element : marks) {
//                sum = sum + element;
//            }
//            System.out.println("THE value of sum is:" + sum);

            //Output of the program is:
            // THE value of sum is:31

//            PROBLEM 2   average of array

//        float[] marks = {6.0f, 7.0f, 8.0f, 9.0f, 1.0f};
//        float sum = 0.0f;
//        for (int i = 0; i < marks.length; i++) {
//            sum = sum + marks[i];
//        }
//            System.out.println("THE  average of array is:" + sum/marks.length);

                 // PROBLEM 3 array is sortint or not

        int[] marks = {6, 7, 8, 9, 1};
       int num=10;
       boolean IsINArray = false;
//       for (int i = 0; i < marks.length; i++) {
//            if(num==marks[i]) {
//                IsINArray = true;
//                break;
            for (int element : marks) {        //for each loop
              if(num==element) {
              IsINArray = true;
               break;
//            }

             }
             }
        if( IsINArray) {
            System.out.println("The value " + num + " is present in the array");
        }
        else{
            System.out.println("The value " + num + " is not present in the array");
        }

    }
    }





