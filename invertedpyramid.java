import java.util.Scanner;

public class invertedpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= i + 1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i - 1; k++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        sc.close();
    }
}
