import java.util.Scanner;
import java.util.Arrays;

public class removeduplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no.of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter  elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            int f = 0;
            for (int j = 0; j < k; j++) {
                if (arr[i] == res[j]) {
                    f = 1;
                    break;
                }
            }
            if (f == 0)
                res[k++] = arr[i];
        }
        System.out.print(Arrays.toString(Arrays.copyOfRange(res, 0, k)));
        sc.close();
    }
}
