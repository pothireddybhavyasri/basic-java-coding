import java.util.Scanner;

public class sumofeveninnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int sum = 0;
        while (i < n) {
            int d = n % 10;
            if (d % 2 == 0) {
                sum += d;
            }
            n /= 10;
            i++;
        }
        System.out.print(sum);
        sc.close();
    }
}
