import java.util.Scanner;

public class encodedstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.print("Enter the number to be subtracted: ");
        int n = sc.nextInt();

        String res = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) - n >= 96) {
                res += (char) (str.charAt(i) - n);
            } else {
                res += (char) (str.charAt(i) - n + 26);
            }

        }
        System.out.print(res);
        sc.close();
    }
}
