import java.util.Scanner;

public class stringcompressionprint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        String res = "";
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                res += str.charAt(i);
                if (count >= 1) {
                    res += count;
                    count = 1;
                }

            }
        }
        System.out.print(res);
        sc.close();
    }
}
