
public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        System.out.print(str);
        System.out.println(str.append("123"));
        System.out.println(str);
        str.insert(5, "abc");
        System.out.println(str);
    }
}
