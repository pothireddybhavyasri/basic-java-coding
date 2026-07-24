public class countofdigitsrecursion {
    int countDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return 1 + countDigits(n / 10);
        }
    }

    public static void main(String[] args) {
        countofdigitsrecursion cdr = new countofdigitsrecursion();
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        sc.close();
        int result = cdr.countDigits(n);
        System.out.println("Number of digits in " + n + " is: " + result);
    }
}
