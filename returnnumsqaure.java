import java.util.*;

public class returnnumsqaure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // example: 5
        int size = 2 * n - 1; // total size of matrix

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int layer = Math.min(Math.min(i, j), Math.min(size - 1 - i, size - 1 - j));
                System.out.print((n - layer) + (j == size - 1 ? "" : " "));
            }
            System.out.println();
        }
        sc.close();
    }
}
