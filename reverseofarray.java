import java.util.Scanner;

public class reverseofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no.of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] rev = new int[n];
        System.out.print("enter  elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            rev[i] = arr[n - 1 - i];
        }

        System.out.print("Reversed Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + rev[i]);
        }
        System.out.println();
        sc.close();
    }
}
