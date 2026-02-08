import java.util.Scanner;

public class alteruniquearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no.of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] hash = new int[101];
        int[] res = new int[n];
        int k = 0;
        System.out.print("enter  elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (hash[arr[i]] == 0) {
                res[k++] = arr[i];
                hash[arr[i]] = 1;
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.print(res[i] + " ");
        }
        sc.close();
    }
}
