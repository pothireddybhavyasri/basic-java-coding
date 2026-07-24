import java.util.Scanner;

public class SimpleEncode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            res += (char) (219 - str.charAt(i));
        }
        System.out.print(res);
        sc.close();
    }
}
