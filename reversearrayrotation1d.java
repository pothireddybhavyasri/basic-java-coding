
import java.util.Arrays;
import java.util.Scanner;

public class reversearrayrotation1d {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] rev = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int t = sc.nextInt();
            int p = n - 1;
            for (int i = 0; i < n; i++) {
                rev[i] = arr[p];
                p--;
            }

            for (int i = 0; i < t - 1 && i + 1 < n; i++) {
                int temp = rev[i];
                rev[i] = rev[i + 1];
                rev[i + 1] = temp;
            }
            Arrays.sort(rev, t, n);
            for (int i = 0; i < n; i++) {
                System.out.print(rev[i] + " ");
            }
        }

    }

}
