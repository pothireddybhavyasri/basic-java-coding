import java.util.Scanner;

public class returnalphabetsofarrayelementsofnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Count: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter Array Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        String str = "";
        for (int i = 0; i < n; i++) {
            str += (char) (arr[i] + 96);
        }
        System.out.print(str);
        sc.close();
    }
}
