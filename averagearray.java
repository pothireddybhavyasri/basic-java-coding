import java.util.Scanner;

public class averagearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no.of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter  elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        avg = (sum) / n;
        System.out.print(avg);
        sc.close();
    }
}
