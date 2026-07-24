import java.util.Scanner;

public class uniquelementsofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no.of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter  elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            int flag = 0;
            for (int j = 0; j < k; j++) {
                if (res[j] == arr[i]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                res[k] = arr[i];
                k++;
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.print(res[i] + " ");
        }
        sc.close();
    }
}
