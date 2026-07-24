import java.util.Scanner;

public class sqauaregap123 {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print((i - 1) + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
