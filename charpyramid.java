import java.util.Scanner;

public class charpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print((char) ('a' + j));
            }
            for (int j = i - 2; j >= 0; j--) {
                System.out.print((char) ('a' + j));
            }
            System.out.println();
        }
    }
}
