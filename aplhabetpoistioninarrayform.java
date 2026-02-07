import java.util.Arrays;
import java.util.Scanner;

public class aplhabetpoistioninarrayform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        StringBuilder positions = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                int pos = Character.toLowerCase(ch) - 'a' + 1;
                positions.append(pos).append(" ");

            }
        }
        String[] posArray = positions.toString().trim().split(" ");
        System.out.println("Alphabet positions ");
        System.out.println(Arrays.toString(posArray));
        sc.close();
    }
}
