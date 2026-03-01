import java.util.Scanner;

public class degree180rotate2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.err.println("");
        int[][] r = new int[n][n];
        int p = 0;
        for (int i = n - 1; i >= 0; i--) {
            int a = n - 1;
            for (int j = 0; j < n; j++) {
                r[p][j] = arr[i][a];
                a--;
            }
            p++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.err.print(r[i][j] + " ");
            }
            System.err.println();
        }
        sc.close();
    }
}
