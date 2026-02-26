import java.util.Scanner;

public class countlowerupperdigitsplchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int uc = 0;
        int lc = 0;
        int dc = 0;
        int splc = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                uc++;
            } else if (Character.isLowerCase(ch)) {
                lc++;
            } else if (Character.isDigit(ch)) {
                dc++;
            } else {
                splc++;
            }
        }

        System.out.println("Uppercase letters: " + uc);
        System.out.println("Lowercase letters: " + lc);
        System.out.println("Digits: " + dc);
        System.out.println("Special characters: " + splc);

        sc.close();
    }
}
