import java.util.Scanner;

public class oppdiagonaloddcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int a = 0;
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i + j == c - 1 && arr[i][j] % 2 != 0) {
                    a++;
                }
            }
        }
        System.out.println(a);
        sc.close();
    }
}