package com.company;

import java.util.Scanner;

public class switch5 {
    // Java Program to Demonstrate Switch Case
// with Multiple Cases Without Break Statements

    // Class

        // main driver method
        public static void main(String[] args) {
            String yn;
            do {
                System.out.print("Enter day in integer vlue:");
                Scanner sc = new Scanner(System.in);
                int day = sc.nextInt();
//            int day =2;
                String dayType;
                String dayString;

                // Switch case
                switch (day) {

                    // Case
                    case 1:
                        dayString = "Monday";
                        break;

                    // Case
                    case 2:
                        dayString = "Tuesday";
                        break;

                    // Case
                    case 3:
                        dayString = "Wednesday";
                        break;
                    case 4:
                        dayString = "Thursday";
                        break;
                    case 5:
                        dayString = "Friday";
                        break;
                    case 6:
                        dayString = "Saturday";
                        break;
                    case 7:
                        dayString = "Sunday";
                        break;
                    default:
                        dayString = "Invalid day";
                }

                switch (day) {
                    // Multiple cases without break statements

                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        dayType = "Weekday";
                        break;
                    case 6:
                    case 7:
                        dayType = "Weekend";
                        break;

                    default:
                        dayType = "Invalid dayType";
                }

                System.out.println(dayString + " is a " + dayType);

                System.out.println("Do you want to continue Press y for yes n for no");
                yn = sc.next();
            } while (yn.equals("y") || yn.equals("Y")) ;
        }
        }



