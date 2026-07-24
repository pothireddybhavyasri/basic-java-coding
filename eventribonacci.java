import java.util.Scanner;

public class eventribonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 1;
        int d = 0;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            d = a + b + c;
            a = b;
            b = c;
            c = d;
            if (d % 2 == 0) {
                System.out.print(d + " ");
            }
        }
        sc.close();
    }
}
