package Evolution2;

import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = scan.nextInt();
        int xor = 0;
        int[] A = new int[size];
        System.out.println("Enter element of Array A");
//        Array A
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + i + " index element : ");
            A[i] = scan.nextInt();
            xor ^= A[i];
        }
        System.out.println("Enter element of Array B");
//        Array B
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + i + " index element : ");
            xor ^= scan.nextInt();
        }
        System.out.println(xor == 0);
    }
}
