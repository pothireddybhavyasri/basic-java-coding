import java.util.Scanner;

public class invertedchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= i + 1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i - 1; k++) {
                System.out.print((char) ('a' + k));
            }
            for (int j = i - 2; j >= 0; j--) {
                System.out.print((char) ('a' + j));
            }

        }
    }
}
