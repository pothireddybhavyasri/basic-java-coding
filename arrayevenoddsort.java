import java.util.Scanner;

//correct it again
public class arrayevenoddsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int j = 0; j < n; j++) {
            arr[j] = sc.nextInt();
        }
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0 && i + 1 != n) {
                    int t = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = t;
                }
            }
        }
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
        }
        sc.close();
    }

}
