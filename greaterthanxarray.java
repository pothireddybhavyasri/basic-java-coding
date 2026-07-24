import java.util.Scanner;

public class greaterthanxarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no.of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter  elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("enter element you want to find the just greater value: ");
        int x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] > x) {
                System.out.print(arr[i]);
                break;
            }
        }
        sc.close();
    }
}
