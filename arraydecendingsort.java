import java.util.Arrays;

public class arraydecendingsort {
    public static void main(String[] args) {

        int[] arr = { 5, 7, 2, 3, 1, 4 };
        int n = arr.length;

        Arrays.sort(arr);
        for (int i = 0; i < n / 2; i++) {
            int t = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = t;
        }

        System.out.print(Arrays.toString(arr));
    }
}