import java.util.Scanner;

public class factorialrecursion {
    int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        factorialrecursion fr = new factorialrecursion();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        sc.close();
        int result = fr.factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
}