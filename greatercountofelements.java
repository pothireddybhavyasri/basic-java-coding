import java.util.Scanner;

public class greatercountofelements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int j = 0; j < n; j++) {
            int m = 0;
            for (int k = 0; k < n; k++) {
                if (a[j] < a[k]) {
                    m++;
                }
            }
            System.out.print(m + " ");
        }
        sc.close();
    }
}
