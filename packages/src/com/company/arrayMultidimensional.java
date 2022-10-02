package com.company;

public class arrayMultidimensional {
    public static void main(String[] args) {
        int marks[][] = new int[2][3];
        marks[0][0] = 7;
        marks[0][1] = 1;
        marks[0][2] = 2;
        marks[1][0] = 3;
        marks[1][1] = 4;
        marks[1][2] = 5;
//        System.out.println(marks[0][1]);
        for (int i = 0; i < marks.length; i++) {
//            for (int j = 0; j <= marks.length; j++) {
//                System.out.println(marks[i][j]);
                for (int j = 0; j < marks[i].length; j++) {
                    System.out.print(marks[i][j]);
                    System.out.print(" ");
                }
                System.out.println("");
            }

        }
    }

