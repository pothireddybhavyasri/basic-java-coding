import java.util.*;

public class passwordcheckercount {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        String p = ss.nextLine();

        int len = 8;
        int lc = 0, uc = 0, d = 0, sc = 0;

        for (int i = 0; i < p.length(); i++) {
            char ch = p.charAt(i);
            if (Character.isLowerCase(ch))
                lc++;
            else if (Character.isUpperCase(ch))
                uc++;
            else if (Character.isDigit(ch))
                d++;
            else
                sc++;
        }

        if (lc >= 1 && uc >= 1 && d >= 1 && sc >= 1 && p.length() >= len) {
            System.out.println("Valid Password");
        } else {
            int ps = 0;
            if (lc == 0)
                ps++;
            if (uc == 0)
                ps++;
            if (d == 0)
                ps++;
            if (sc == 0)
                ps++;

            if (p.length() < len) {
                int m = len - p.length();
                if (ps < m)
                    ps = m;
            }

            System.out.println(ps);
        }
        ss.close();
    }

}
