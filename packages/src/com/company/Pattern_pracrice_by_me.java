//    Pattern problen for * and number  total 31 problem done in this pattern practice section

package com.company;
import java .util.*;
public class Pattern_pracrice_by_me {
    public static void main(String[] args) {
//        int n=5;

        // for rows

//        for(int i=1;i<=5;i++){
        // for column

//            for(int j=1;j<=5;j++){
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }
//    }
//}

// output foe print * in problem 1
//        *****
//        *****
//        *****
//        *****
//        *****

        //       output for print i in problem 1
//        11111
//        22222
//        33333
//        44444
//        55555

//       output for print j in problem 1

//        12345
//        12345
//        12345
//        12345
//        12345

        // problem 1 for  hollow rectangle

//
//        int n=4;
//        int m=5;
////        for outer loop
//        for (int i = 1; i <= n; i++) {
////            inner loop
//            for (int j = 1; j <= m; j++) {
////                cell->(i,j)
//                if (i == 1 || j == 1 || i == n || j == m) {
//                    System.out.print(j);
//                } else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}

//  output 1.1 for  hollow rectangle for *


//taken n=4 and m=5
//print  like this
//       *****
//       *   *
//       *   *
//       *****

//  output 1.1 for  hollow rectangle for i

//        11111
//        2   2
//        3   3
//        44444

//  output 1.1 for  hollow rectangle for j

//        12345
//        1   5
//        1   5
//        12345


        // problem -  2
//
//        int n=5;
//     //    for rows
//
//        for(int i=1;i<=5;i++){
//      //   for column
//
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }
//    }
//}

//        output for print * in problem - 2

//        *
//        **
//        ***
//        ****
//        *****

//        output for print i in problem - 2

//        1
//        22
//        333
//        4444
//        55555

//        output for print j in problem - 2

//        1
//        12
//        123
//        1234
//        12345

        // problem 3

//        int n=5;
//      //   for rows
//
//        for(int i=1;i<=5;i++){
//        // for column
//
//            for(int j=1;j<=6-i;j++){
//                System.out.print(j);
//
//            }
//            System.out.println();
//        }
//    }
//}

//        output for print * in problem - 3
//        *****
//        ****
//        ***
//        **
//        *

//        output for print i in problem - 3

//        11111
//        2222
//        333
//        44
//        5

//        output for print i in problem - 3

//        12345
//        1234
//        123
//        12
//        1

        // problem 3 same can be written this method also
//
//        int n=5;
        // for rows

//        for(int i=5;i>=1;i--){
        // for column

//            for(int j=1;j<=i;j++){           // change only for loop in j
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }
//    }
// }

//        output for print * in problem - 3 same only changr in for loop in j

//        *****
//        ****
//        ***
//        **
//        *

//        output for print i in problem - 3 same only changr in for loop in j

//        11111
//        2222
//        333
//        44
//        5

//        output for print j in problem - 3 same only changr in for loop in j


//        12345
//        1234
//        123
//        12
//        1

        //  problem  - 4 triangle shape
//
//        int n = 5;
//        // for rows
//
//        for (int i = 1; i <= 5; i++) {
//
//            // for spaces
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//                // for column
//            }
//                for (int j = 1; j <= i; j++) {
//                    System.out.print(j + " ");
//
//                }
//                System.out.println();
//            }
//        }
//    }


//        output for print * in problem - 4  triangle shape

//            *
//           * *
//          * * *
//         * * * *
//        * * * * *

//        output for print i in problem - 4 triangle shape

//             1
//            2 2
//           3 3 3
//          4 4 4 4
//         5 5 5 5 5
//        output for print j in problem - 4  triangle shape

//             1
//            1 2
//           1 2 3
//          1 2 3 4
//         1 2 3 4 5

//   problem -5
//
//    int n=5;
//// for rows
//
//        for(int i=1;i<=5;i++){
//
//            // for spaces
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//
//            }
//                // for column
//
//                for(int j=1;j<=i;j++){
//                System.out.print(j);
//
//                }
//                System.out.println();
//        }
//    }
//}

//        output for print * in problem - 5


//              *
//             **
//            ***
//           ****
//          *****

//        output for print i in problem - 5
//
//                1
//               22
//              333
//             4444
//            55555


//        output for print j in problem - 5

//               1
//              12
//             123
//            1234
//           12345

// problem 6

//        int line=5;
//        int spaces=(line*2)-2;
//    // for rows
//        for(int i=1;i<=line;i++){
//
//
//        //left part
//            for(int j=1;j<=i;j++) {
//                System.out.print("*");
//            }
//            // for spaces
//            for(int j=1;j<=spaces;j++) {
//                System.out.print(" ");
//            }
//
//                // right part
//                for(int j=1;j<=i;j++){
//                    System.out.print("*");
//
//            }
//                spaces = spaces-2;
//                System.out.println();
//        }
//    }
//}


//// output  of program 6 is
//
////      *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********

//  problem number 6 can also be written like this


//    int line=5;
//// for rows
//        for( int i=1;i<=line;i++){
//
//
//                //left part
//                for(int j=1;j<=i;j++) {
//                System.out.print("*");
//                }
//                // for spaces
//                for(int j=1;j<=2*(line-i);j++) {          // only for different in spaces print
//                System.out.print(" ");                    //and we can also use of j variable place alag alag variable
//                                                         // use kar sakte hai for spaces k and for right part k
//                }
//
//                // right part
//                for(int j=1;j<=i;j++){
//                System.out.print("*");
//
//                }
//           //     spaces = spaces-2;
//                System.out.println();
//        }
//    }
// }


//// output  of program 6 is for *
//
////      *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********

//// output  of program 6 is for i

//        1        1
//        22      22
//        333    333
//        4444  4444
//        5555555555

//// output  of program 6 is for j

//        1        1
//        12      12
//        123    123
//        1234  1234
//        1234512345

//  problem number 7  for mirror image is:


//        int line=5;
//// for rows
//        for( int i=1;i<=line;i++){
//
//
//            //left part
//            for(int j=1;j<=i;j++) {
//                System.out.print(j);
//            }
//            // for spaces
//            for(int j=1;j<=2*(line-i);j++) {
//                System.out.print(" ");
//            }
//
//            // right part
//            for(int j=i;j>=1;j--){       // only for change in right part
//                System.out.print(j);     // reverse its right part
//
//            }
//            System.out.println();
//        }
//    }
//}

        //   output of problem number 7 for mirror image is:


//        1        1
//        12      21
//        123    321
//        1234  4321
//        1234554321

        //  problem number 8 for pyramid
//
//
//        int line=5;
//// for rows
//        for( int i=1;i<=line;i++) {
//
//            // for spaces
//            for(int j=1;j<=line-i;j++) {
//                System.out.print(" ");
//            }
//
//            //left part
//            for(int j=1;j<=i;j++) {
//                System.out.print("*");
//            }
//
//
//            // right part
//            for(int j=2;j<=i;j++){       // only for change in right part
//                System.out.print("*");     // reverse its right part
//
//            }
//            System.out.println();
//        }
//    }
// }
//
//// output of problem number 8  for *
//
//           *
//          ***
//         *****
//        *******
//       *********

// output of problem number 8  for i

//            1
//           222
//          33333
//         4444444
//        555555555


// output of problem number 8  for j
//
//            1
//           122
//          12323
//         1234234
//        123452345


//  problem number 9 for pyramid  for taking user input and in running time ask user to continue or not  for print using
        // do while loop.

        String yn;
         do {


             Scanner sc = new Scanner(System.in);
             System.out.println("Enter the number of rows : ");
             int line = sc.nextInt();

             if (line <= 10) {
// for rows
                 for (int i = 1; i <= line; i++) {

                     // for spaces
                     for (int j = 1; j <= line - i; j++) {
                         System.out.print(" ");
                     }


                     // for j
                     for (int j = 1; j <= (i * 2 - 1); j++) {       // only for change in  j value print not use left and right part
                         System.out.print("*");

                     }
                     System.out.println();
                 }
             } else {
                 System.out.println("Enter value less then 10  or equals to 10:");
             }
             System.out.println("Do you want to continue Press y for Yes and  press n for No ");
             yn = sc.next();
         }while(yn.equals("Y") || yn.equals("y"));

        }
    }


// output of problem number 9  for *

//           *
//          ***
//         *****
//        *******
//       *********