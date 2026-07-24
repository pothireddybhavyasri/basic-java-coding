import java.util.Scanner;

public class rightallignedpattern {
    public static void main(String[] args) {
        int a = 0;
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            a += (int) Math.pow(10, i);
            System.out.println(a * i);
        }

        sc.close();
    }
}
