import java.util.Scanner;

public class printupperlowerdigitsappendatsingleplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        StringBuilder upperCase = new StringBuilder();
        StringBuilder lowerCase = new StringBuilder();
        StringBuilder digits = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                upperCase.append(ch);
            } else if (Character.isLowerCase(ch)) {
                lowerCase.append(ch);
            } else if (Character.isDigit(ch)) {
                digits.append(ch);
            }
        }
        System.out.println(upperCase.toString() + lowerCase.toString() + digits.toString());
        sc.close();
    }
}
