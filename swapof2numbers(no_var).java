public class swapof2numbers(no_var) {
    public static void main(String[] args) {
        int a = 5, b = 10;

        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}