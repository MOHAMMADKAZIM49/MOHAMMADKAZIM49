package com.company;

public class string1 {
    public static void main(String[]args){
//        String name;
//        String name= "Harry";
//        String name = "Harry ka hal ba";  //question 2
        String letter=" Dear <|name|>, Thanks a lot"; //question3
        letter=letter.replace("<|name|>", "Harry");  //answer3
        System.out.println(letter);
        String mystring ="This  string contains   double and triple spaces";  //question4
        System.out.println(mystring.indexOf("  ")); //answer4
        System.out.println(mystring.indexOf("   ")); //answer4
//        name = new String("Harry");
//        System.out.println(name);
//        System.out.println(name.length());
//        System.out.println(name.toLowerCase());
//        System.out.println(name.toUpperCase());
//        System.out.println(name.trim());
//        System.out.println(name.substring(2));
//        System.out.println(name.substring(0,3));
//        System.out.println(name.replace(' ','_'));  //answer 2
//        System.out.println(name.replace('r','p'));
//        System.out.println(name.startsWith("Ha"));
//        System.out.println(name.endsWith("ry"));
//        System.out.println(name.charAt(2));
//        System.out.println(name.lastIndexOf("s"));
//        System.out.println(name.indexOf("s",3));
//        System.out.println(name.lastIndexOf("r"));
//        System.out.println(name.lastIndexOf("r",2));
//        System.out.println(name.equals("Harry"));
//        System.out.println(name.equalsIgnoreCase("harry"));
    }
}
