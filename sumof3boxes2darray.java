import java.util.*;

public class sumof3boxes2darray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter no of elements: ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.print("enter no  elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        int sum1 = 0, sum2 = 0, sum3 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i == j)
                    sum1 += arr[i][j];

                else if (i < j)
                    sum2 += arr[i][j];
                else
                    sum3 += arr[i][j];

            }
        }
        if (sum1 > sum2 && sum1 > sum3)
            System.out.println("Diagonal Matrix:" + sum1);
        if (sum2 > sum3 && sum2 > sum1)
            System.out.println("upper trinagular matrix:" + sum2);
        if (sum3 > sum2 && sum3 > sum1)
            System.out.println("lower trinagular matrix :" + sum3);
        sc.close();
    }
}
