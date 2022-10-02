package com.company;
import java.util.*;
public class practise {
    public static void main(String args[]){
       String yn;
       do {

               // 1. -> calculate area and perimeter of rectangle
               Scanner sc = new Scanner(System.in);
      /*  int l=4;
        int b=5;
         int area=l*b;
         int perimeter= 2*(l+b);
        System.out.println("the area is:"+area);
        System.out.println("the perimeter is:" +perimeter);
        */


               // 2. -> calculate area and perimeter  of circle
        /*
        int radius=5;
         double area= 3.141*radius*radius;  //pi r square hota hai pi=3.141 or 22/7
      double   perimeter = 2*3.141*side; //or circumference
        System.out.println("the area is:"+area);
        System.out.println("the perimeter is:" +perimeter);
        */
               // 3. ->calculate area and perimeter  of square
        /*
        int side=5;
        float area=side*side; // side square hota hai
        double   perimeter = 4*side; //or circumference 4*side hota  hai
        System.out.println("the area is:"+area);
        System.out.println("the perimeter is:" +perimeter);
        */


               // 4. -> calculate area and perimeter  of  right angle triangle
           /*
        int heights=4;
        int base=9;
       int hypotenuse=3;
        long area= (base*heights)/2;   //1/2 base*height
        int perimeter= heights+base+ hypotenuse; //sum of all sides
        System.out.println("the area is:"+area);
        System.out.println("the perimeter is:" +perimeter);
      */


               // 5.-> calculate area and semi-perimeter  of  scalene triangle
           /*
               double side1 = 6.0d;    // is triangle me teeno side alag hota hai
               double side2 = 5.0d;
               double side3 = 4.0d;
               double semiperimeter = (side1 + side2 + side3) / 2.0d; //sum of all sides
               double area = Math.sqrt(semiperimeter * (semiperimeter - side1) * (semiperimeter - side2) * (semiperimeter - side3));

               System.out.println("the area is:" + area);
               System.out.println("the perimeter is:" + semiperimeter);
            */

               // 6.-> calculate area and perimeter  of  isosceles  right angle triangle
        /*
        int side=4;      //is triangle me do side same hota hai aur ek alag hota hai
        int base=9;


        long area= (1*side*base)/2;  //1*base *height
        int perimeter= 2*side+base ;
        System.out.println("the area is:"+area);
        System.out.println("the perimeter is:" +perimeter);
        */

               // 7.-> calculate area and perimeter  of  equilateral  triangle
       /*
        int side=4;                       // formula area underroot3/4 side*side(side square)
         double area=(1.73*side*side);    //is triangle me teno side same hota hai //underroot3=1.73
        int perimeter= side+side+side ; //or 3*side
        System.out.println("the area is:"+area);
        System.out.println("the perimeter is:" +perimeter);
        */
           // 8.-> calculate sum of three number

        int num1=4;
         int num2=4;
         int num3=8;
        int sum=num1+num2+num3;
        System.out.println("The sum is :"+sum);


               System.out.println("DO you want to continue Press y for YES and n for NO");
               yn = sc.next();
           } while (yn.equals("y") || yn.equals("Y"));
    }
}






