import java.util.Scanner;

public class arrayrotationprint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number of rotations: ");
        int r = sc.nextInt();
        r = r % n;
        System.out.print("[");
        for (int i = n - r; i < n; i++) {
            System.out.print(arr[i]);
            System.out.print(", ");
        }

        for (int i = 0; i < n - r; i++) {
            System.out.print(arr[i]);
            if (i < n - r - 1)
                System.out.print(", ");
        }

        System.out.println("]");
        sc.close();
    }
}
