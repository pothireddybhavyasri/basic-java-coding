import java.util.Scanner;

public class tribonacciseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 1;

        System.out.print(a + " " + b + " " + c + " ");
        for (int i = 2; i < n; i++) {
            int d = a + b + c;
            a = b;
            b = c;
            c = d;
            System.out.print(d + " ");
        }
        sc.close();
    }
}
