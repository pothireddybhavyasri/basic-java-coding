import java.util.Scanner;

public class umofelementsincoumn2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no.of elements in row and column: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.print("enter  elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {
                sum += arr[j][i];
            }
            System.out.println(sum);

        }

        sc.close();
    }
}
