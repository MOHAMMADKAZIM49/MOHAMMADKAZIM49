package com.company;

import java.util.Scanner;

public class kwh_string_practice3 {
    public static void main(String[] args) {
        // String name = new String("Kazim");
        // String name = "Kazim";
        // System.out.print("The name is: ");
        // System.out.print(name);
//        int a = 6;
//        float b = 5.6454f;
        //System.out.printf("The value of a is %d and value of b is %8.2f", a, b);
        //System.out.format("The value of a is %d and value of b is %f", a, b);
        // Scanner sc = new Scanner(System.in);
//        String st = sc.next();
//        String st = sc.nextLine();
//        System.out.println(st);
      // }
        // }

        //  practise theory of string


        String name = "Harry";
        // System.out.println(name);
//                int value = name.length();
//                System.out.println(value);

        //String lstring = name.toLowerCase();
        //System.out.println(lstring);

        //String ustring = name.toUpperCase();
        //System.out.println(ustring);

        String nonTrimmedString = "     Harry     ";
                System.out.println(nonTrimmedString);

        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);

        System.out.println(name.substring(1));
        System.out.println(name.substring(1,5));

        System.out.println(name.replace('r', 'p'));
        System.out.println(name.replace("r", "ier"));

        System.out.println(name.startsWith("Har"));
        System.out.println(name.endsWith("dd"));

        System.out.println(name.charAt(4));

        String modifiedName = "Harryrryrry";
        System.out.println(modifiedName.indexOf("rry"));
        System.out.println(modifiedName.indexOf("rry", 4));
        System.out.println(modifiedName.lastIndexOf("rry", 7));

        System.out.println(name.equals("Harry"));
        System.out.println(name.equalsIgnoreCase("HarRY"));

        System.out.println("I am escape sequence\tdouble quote");
    }
     }



                //  start practice problem 3 of STRING

                // Problem 1

    //  question1  Write a Java program to convert a string to lowercase.

//                String name = "Jack Parker";
//                name = name.toLowerCase();
//                System.out.println(name);

                // Problem 2

       // question 2  Write a Java program to replace spaces with underscores.

//                String text = "To My     Friend";
//                text = text.replace(" ", "_");
//                System.out.println(text);

                // Problem 3

        // question3 Write a Java program to fill in a letter template which looks like below:

        //             letter = “Dear <|name|>, Thanks a lot”
        //              Replace <|name|> with a string (some name)

//        String letter = "Dear <|name|>, Thanks a lot!";
//        letter = letter.replace("<|name|>", "Sachin");
//        System.out.println(letter);

                // Problem 4

       // question 4   Write a Java program to detect double and triple spaces in a string.


//                String myString = "This string contains double and  triple spaces";
//                System.out.println(myString.indexOf("  "));
//                System.out.println(myString.indexOf("   "));

                // Problem 5

        // question5.  Write a program to format the following letter using escape sequence characters.
        //             Letter = “Dear Harry, This Java Course is nice. Thanks”
        // solution:

//                String myLetter = "Dear Harry,\n\tThis Java Course is Nice.\nThanks!";
//                System.out.println(myLetter);

      //      }
    //









