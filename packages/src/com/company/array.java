
import java.util.Scanner;
public class array {
    public  static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your  array size:");
        int size = sc.nextInt();
        int numbers[] = new int[size];
//        input
        for (int i = 0; i <size; i++) {
            numbers[i] = sc.nextInt();
        }
//        output

        for ( int i = 0; i <size; i++) {
            System.out.println(numbers[i]);
        }

    }
}