import java.util.Scanner;

public class evenarraysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no.of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter  elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) { // if even index positioned sum then instaed if i%2==0 it is arr[i]%2==0
                sum += arr[i];
            }
        }
        System.out.print(sum);
        sc.close();
    }
}
