import java.util.Scanner;

public class maxofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no.of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter  elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.print(max);
        sc.close();
    }
}
