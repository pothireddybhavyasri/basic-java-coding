import java.util.Scanner;

public class countlowerupperinstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        int upperc = 0, lowerc = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                upperc++;
            } else if (Character.isLowerCase(ch)) {
                lowerc++;
            }
        }
        System.out.println(upperc);
        System.out.println(lowerc);
        sc.close();
    }
}
