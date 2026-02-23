public class charcetratindexofafterexpansionofstringcompression {
    public static void main(String[] args) {
        String compressedStr = "a2b3c1"; // Example compressed string
        StringBuilder expandedStr = new StringBuilder();

        // Expanding the compressed string
        for (int i = 0; i < compressedStr.length(); i++) {
            char ch = compressedStr.charAt(i);
            if (Character.isLetter(ch)) {
                int count = 0;
                i++;
                while (i < compressedStr.length() && Character.isDigit(compressedStr.charAt(i))) {
                    count = count * 10 + (compressedStr.charAt(i) - '0');
                    i++;
                }
                i--; // Adjust index after inner loop
                for (int j = 0; j < count; j++) {
                    expandedStr.append(ch);
                }
            }
        }

        // Finding index of a character in the expanded string
        char targetChar = 'b'; // Example target character
        int index = -1;
        for (int i = 0; i < expandedStr.length(); i++) {
            if (expandedStr.charAt(i) == targetChar) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("The index of character '" + targetChar + "' is: " + index);
        } else {
            System.out.println("Character '" + targetChar + "' not found in the expanded string.");
        }
    }
}
