package com.company;
import java.util.Scanner;
import java.util.Random;

public class kwh_conditions_ifelse_practice_4 {
    public static void main(String[] args) {
//        int a = 29;
//        if (a>18) {
//            System.out.println("You can Drive");
//        }
//        else{
//            System.out.println(" You are underage!");
//        }
//
//    }
//}
//  Output:
//You can drive

        // operators examples

//                System.out.println("For Logical AND...");
//                boolean a = true;
//                boolean b = false;
//        if (a && b){
//            System.out.println("Y");
//        }
//        else{
//            System.out.println("N");
//        }

        // System.out.println("For Logical OR...");

//        if (a || b){
//            System.out.println("Y");
//        }
//        else{
//            System.out.println("N");
//        }

//                System.out.println("For Logical NOT");
//                System.out.print("Not(a) is ");
//                System.out.println(!a);
//                System.out.print("Not(b) is ");
//                System.out.println(!b);
//            }
//        }


//                         SWITCH CASE


//                String var = "Saurabh";
//
//
//                switch (var) {
//                    case "Shubham" :
//                        {
//                        System.out.println("You are going to become an Adult!");
//                        System.out.println("You are going to become an Adult!");
//                        System.out.println("You are going to become an Adult!");
//                    }
//                    case "Saurabh" :  System.out.println("You are going to join a Job!");
//                    case "Vishaka" : System.out.println("You are going to get retired!");
//                    default : System.out.println("Enjoy Your life!");
//                }
//                System.out.println("Thanks for using my Java Code!");


        /*
        int age;
        System.out.println("Enter Your Age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age>56){
            System.out.println("You are experienced!");
        }
        else if(age>46){
            System.out.println("You are semi-experienced!");
        }
        else if(age>36){
            System.out.println("You are semi-semi-experienced!");
        }
        else{
            System.out.println("You are not experienced");
        }
        if(age>2){
            System.out.println("You are not a baby!");
        }
        */

        // }
        //  }


        //   Question 1 : What will be the output of this program:

//        int a = 10;
//        if (a = 11)
//            System.out.println( "I am 11");
//        else
//            System.out.println("I am not 11");
//    }
//}
// output me error dega kyoki = not a comparijon operator it is a assignment operator


//       //   Question 1 : What will be the output of this program:

//         int a = 10;
////        if (a = 11)
////            System.out.println( "I am 11");
////        else
////            System.out.println("I am not 11");
////    }
//    }
//}
        // output1. me error dega kyoki = not a comparijon operator it is a assignment operator


        //  Question 2: Write a program to find out whether a student is pass or fail;
        // if it requires a total of 40% and at least 33% in each subject to pass.
        // Assume 3 subjects and take marks as input from the user.

//        byte m1, m2, m3;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your marks in Physics");
//        m1 = sc.nextByte();
//
//        System.out.println("Enter your marks in Chemistry");
//        m2= sc.nextByte();
//
//        System.out.println("Enter your marks in Mathematics");
//        m3 = sc.nextByte();
//        float avg = (m1+m2+m3)/3.0f;
//        System.out.println("Your Overall percentage is: " + avg);
//        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
//            System.out.println("Congratulations, You have been promoted");
//        }
//        else{
//            System.out.println("Sorry, You have not been promoted! Please try again.");
//        }
//    }
//}


        // Question 3 :Calculate income tax paid by an employee to
        // the government as per the slabs mentioned below:
        //Income Slab	Tax
        //2.5L – 5.0L  	5%
        //5.0L – 10.0L 	20%
        //Above 10.0L	30%
        //Note that there is not tax below 2.5L. Take the input amount as input from the user.


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your income in Lakhs per annum");
//        float tax = 0;
//        float income = sc.nextFloat();
//        if(income<=2.5){
//            tax = tax + 0;
//        }
//        else if(income>2.5f && income <= 5f){
//            tax = tax + 0.05f * (income - 2.5f);
//        }
//        else if(income>5f && income <= 10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (income - 5f);
//        }
//        else if(income>10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (10.0f - 5f);
//            tax = tax + 0.3f * (income - 10.0f);
//        }
//
//        System.out.println("The total tax paid by the employee is: " + tax);
//    }
// }

//        Question 4: Write a Java program to find out the day of the week
//        given the number [1 for Monday, 2 for Tuesday … and so on!]

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int day = sc.nextInt();
//
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println(" please enter the valid number between 1 to 7");
//        }
//    }
//}


        // Question 5 :Write a Java program to find whether a year entered by
        //            the user is a leap year or not.

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the year:");
//        int year = sc.nextInt();
//        if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
//
//            System.out.println("It is a leap year");
//        } else {
//            System.out.println(" It is not a leap year");
//        }
//    }
//}

  // Another method to leap year  using if else



    String yn;
        do {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the year:");
                int year = sc.nextInt();
                if (year % 4 == 0) {
                if (year % 100 == 0) {
                if (year % 400 == 0) {
                System.out.println("It is a leap year");
                } else {
                System.out.println("It is not a leap year");
                }
                } else {
                System.out.println("It is a leap year");
                }
                } else {
                System.out.println("It is not a leap year");
                }
                System.out.println("Do you want to continue (Press y for Yes and n for No)");
                yn = sc.next();
                } while(yn.equals("y")||yn.equals("Y"));
                }
                }




//       Question 6:  Write a program to find out the type of website from the URL:
//.com – commercial website
//.org – organization website
//.in – Indian website



//        Scanner sc = new Scanner(System.in);
//        String website = sc.next();
//        if(website.endsWith(".org")){
//            System.out.println("This is an organizational website");
//        }
//        else if(website.endsWith(".com")){
//            System.out.println("This is a Commercial website");
//        }
//        else if(website.endsWith(".in")){
//            System.out.println("This is an Indian website");
//        }
//                Random r = new Random();
//                int a = r.nextInt();
//                System.out.println(a);
////
//            }
//        }


