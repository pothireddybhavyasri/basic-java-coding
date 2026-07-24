import java.util.Scanner;

public class powerprint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // input number
        sc.close();

        int temp = n;
        int len = 0;
        while (temp > 0) {
            len++;
            temp /= 10;
        }
        temp = n;
        int i = len;
        int sum = 0;
        while (i > 0) {
            int divisor = (int) Math.pow(10, i - 1);
            int d = temp / divisor;
            sum += (int) Math.pow(d, i);
            temp = temp % divisor;
            i--;
        }
        System.out.println(sum);
    }
}
