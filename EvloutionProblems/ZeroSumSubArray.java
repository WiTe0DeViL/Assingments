package Evolution2;

import java.util.HashMap;
import java.util.Scanner;

import static java.lang.Math.abs;

public class ZeroSumSubArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<Integer, int[]> map = new HashMap<>();
        System.out.print("Enter the size of the array : ");
        int n = scan.nextInt();
        Integer[] array = new Integer[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + i + " index element : ");
            array[i] = scan.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = array[i];
            for (int j = i + 1; j < n; j++) {
                sum += array[j];
                if (sum == 0) {
                    int[] tempArray = new int[j + 1];
                    for (int index = i; index <= j; index++)
                        tempArray[index] = array[index];
                    map.put(abs(i - j), tempArray);
                    max = Math.max(abs(i - j), max);
                }
            }
        }
        for (int val : map.get(max)) {
            if (val != 0)
                System.out.print(val + " ");
        }
    }
}
