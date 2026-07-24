import java.util.Scanner;

public class searchelementin2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no.of elements in row and column: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.print("enter  elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("enter  element to found: ");
        int found = sc.nextInt();
        int f = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == found) {
                    f = 1;
                    System.out.print("yes");
                    break;
                }
            }
        }
        if (f == 0)
            System.out.print(" not found");
        sc.close();
    }
}
