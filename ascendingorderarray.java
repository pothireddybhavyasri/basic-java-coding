
import java.util.*;

public class ascendingorderarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                count++;
            }
        }

        // If all pairs are correct, array is ascending
        if (count == n - 1) {
            System.out.println("Array is in ascending order.");
        } else {
            System.out.println("Array is NOT in ascending order.");
        }
        sc.close();
    }
}
