public class counttheevencountofdigits {
    public static void main(String[] args) {
        int[] arr = { 14, 286, 3113, 6, 17 };
        int evenCount = 0;
        for (int num : arr) {
            int digitCount = 0;
            int temp = num;
            while (temp != 0) {
                temp /= 10;
                digitCount++;
            }
            if (digitCount % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Count of numbers with even number of digits: " + evenCount);
    }
}