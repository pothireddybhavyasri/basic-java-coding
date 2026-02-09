import java.util.Scanner;

public class alterofeachlessthan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] pf = new int[100];
        for (int i = 0; i < n; i++) {
            pf[arr[i]] += 1;
        }
        for (int i = 0; i < n; i++) {
            pf[i] = pf[i] + pf[i - 1];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(pf[arr[i] - 1] + " ");
        }
        sc.close();
    }
}
