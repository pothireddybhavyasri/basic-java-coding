import java.util.Scanner;

public class evenfib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.print(a + " " + b + " ");
        for (int i = b; i < n - 1; i++) {
            c = a + b;
            a = b;
            b = c;
            if (c % 2 == 0) {
                System.out.print(c + " ");
            }
        }

        sc.close();
    }
}
