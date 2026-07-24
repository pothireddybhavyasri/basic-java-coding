import java.util.Scanner;

public class outputposiionin2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no.of elements in row and column: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.print("enter  elements in row and column: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("enter outputs: ");
        int t = sc.nextInt(); // number of test cases
        while (t != 0) {
            int pos = sc.nextInt();
            int count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (count == pos) {
                        System.out.print(arr[i][j] + " ");
                        break;
                    }
                    count++;
                }
            }
            t--;
        }
        sc.close();
    }
}
// int t=sc.nextInt();
// while(t!=0){
// int pos=sc.nextInt();
// sop(arr[pos/m][pos%m]);
// t--;
// }