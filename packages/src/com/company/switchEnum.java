
package com.company;

import java.util.Scanner;

public class switchEnum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String shoes = sc.next();
//        String shoes ="Adidas";    //agar user se input nahi lena hai to is tarah koi ek string likhna hoga tabhi
//        String shoes ="Puma";      //pogram run karega agar3no loge to error aayega
//        String shoes ="Reebok";
        switch(shoes){
            case "Adidas":
            System.out.println("Adidas - Impossible is nothing");
            break;
            case "Puma":
                System.out.println("Puma - Forever Faster");
                break;
            case "Reebok":
                System.out.println("Reebok - I Am What I Am");
                break;
            default:
                System.out.println("Invalid phone");
        }
    }
}
