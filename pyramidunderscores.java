import java.util.Scanner;

class pyramidunderscores {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("_");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(k + "_");
            }
            for (int j = n; j >= i; j--) {
                System.out.print("_");
            }

            System.out.print("\n");
        }
        sc.close();
    }

}