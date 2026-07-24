public class naturalnumbersreverserecursion {
    public static void main(String[] args) {
        int n = 10;
        printNaturalNumbersReverse(n);
    }

    public static void printNaturalNumbersReverse(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printNaturalNumbersReverse(n - 1);
    }
}