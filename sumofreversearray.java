import java.util.Scanner;

public class sumofreversearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no.of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] rev = new int[n];
        int[] sum = new int[n];
        System.out.print("enter  elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            rev[i] = arr[n - 1 - i];
        }
        for (int i = 0; i < n; i++) {
            sum[i] = arr[i] + rev[i];
        }

        System.out.print("Sum Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + sum[i]);
        }
        System.out.println();
        sc.close();
    }
}
