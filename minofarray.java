import java.util.Scanner;

public class minofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no.of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter  elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.print(min);
        sc.close();
    }
}
