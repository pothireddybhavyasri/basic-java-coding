import java.util.Scanner;

public class seriesone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long term = 3;

        for (int i = 2; i <= n; i++) {
            term = term * (term - 1);
        }
        System.out.println(term);
        sc.close();
    }
}
