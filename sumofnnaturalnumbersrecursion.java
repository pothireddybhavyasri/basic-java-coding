import java.util.Scanner;

public class sumofnnaturalnumbersrecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        sc.close();
        int result = sumOfNaturalNumbers(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + result);
    }

    public static int sumOfNaturalNumbers(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumOfNaturalNumbers(n - 1);
        }
    }
}
