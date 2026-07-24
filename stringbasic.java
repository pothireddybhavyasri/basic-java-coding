import java.util.Scanner;
import java.util.Arrays;

public class stringbasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "hello";
        System.out.println(str.length());
        System.out.println(str.charAt(1));
        System.out.println(str.indexOf("1"));
        System.out.println(str.indexOf("ell"));
        System.out.println(str.lastIndexOf("l"));
        System.out.println((str.replace("l", "p")));
        System.out.println((str.toUpperCase()));
        String s1 = "hello";
        String s2 = "HELLO";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        String s3 = "    hi     ";
        System.out.println(s3);
        System.out.println(s3.trim());
        String s4 = "hey all how are you";
        System.out.println(Arrays.toString(s4.split(" ")));
        System.out.println(Arrays.toString(s4.split("a")));
        sc.close();
    }
}
