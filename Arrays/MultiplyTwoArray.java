package Take_U_Forward;

public class MultiplyTwoArray {
    public static void main(String[] args) {
        int[][] arr1 = {{2, 3}, {3, 4}}, arr2 = {{5, 6, 7}, {2, 3, 4}};
        int[][] ans = new int[arr1[1].length][arr2.length];
        int sum = 0;
        if (arr1[1].length == arr2.length) {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    for (int k = 0; k < arr1[1].length; k++) {
                        sum += arr1[i][k] * arr2[k][j];
                    }
                    ans[i][j] = sum;
                    sum = 0;
                }
            }
        } else {
            System.out.println("Its not an Valid array");
        }
        for (int[] i : ans) {
            for (int j : i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
