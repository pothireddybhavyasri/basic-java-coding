import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        for (int k = n - 1; k >= 1; k--) {
            for (int x = 1; x <= k; x++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
