import java.util.Scanner;

public class indexofcharacterofstringcompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        char targetChar = sc.nextLine().charAt(0);
        sc.close();
        System.out.println("Enter the character to find its index: ");

        int index = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == targetChar) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("The index of character '" + targetChar + "' is: " + index);
        } else {
            System.out.println("Character '" + targetChar + "' not found in the string.");
        }
    }
}
