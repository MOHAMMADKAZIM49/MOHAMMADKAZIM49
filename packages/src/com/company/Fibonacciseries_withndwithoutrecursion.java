package com.company;
import java.util.*;
public class Fibonacciseries_withndwithoutrecursion {
    public static void main(String ars[]) {
//       int n1 = 1;
//         int n2= 1;
//        System.out.println(n1);
//        System.out.println(n2);
//        for(int i=2;i<10; i++){
//            int n3 = n1+n2;
//            System.out.println(n3);
//            n1= n2;
//            n2=n3;
//
//        }
//    }
//
//}


//    for taking user input


//        String yn;
//       do {
//            int n1 = 1;
//            int n2 = 1;
//            int count;
//
//
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter the number upto which fibonacci series  you want to print:");
//            count = sc.nextInt();
//            System.out.println(n1);
//            System.out.println(n2);
//            for (int i = 2; i < count; i++) {
//                int n3 = n1 + n2;
//                System.out.println(n3);
//                n1 = n2;
//                n2 = n3;
//            }
//                System.out.println("Do you want to continue Press y for Yes and n for No");
//               yn = sc.next();
//
//
//        } while (yn.equals("y") || yn.equals("Y")) ;
//        }
//    }


//           FOR RECURSION use to calculate fibonacci series



       // int val = 0;

        for(int i=1;i<=10; i++){

          //  function call

             //  val =  fibbo(i);
            //    System.out.println(val);

            fibbo(i);
            System.out.println(fibbo(i));

        }
    }
   static int fibbo(int pos){
        if( pos==1 ||pos==2){
            return 1;
        }else{
            return fibbo(pos -1)+ fibbo(pos-2);
        }
   }

}

