public class reversenumberrecursion {

    public static void main(String[] args) {
        int num = 12345;
        System.out.println("Reversed number: " + reverseNumber(num, 0));
    }

    public static int reverseNumber(int num, int reversed) {
        if (num == 0) {
            return reversed;
        }
        return reverseNumber(num / 10, reversed * 10 + num % 10);
    }
}