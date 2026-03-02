import java.util.Scanner;

public class degreerotate2d90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no.of elements: ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.print("enter  elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] r = new int[n][n];
        int a = 0;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                r[a][j] = arr[i][j];
            }
            a++;
        }
        System.out.println("----------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.err.print(r[j][i] + " ");
            }
            System.err.println();
        }
        sc.close();
    }
}