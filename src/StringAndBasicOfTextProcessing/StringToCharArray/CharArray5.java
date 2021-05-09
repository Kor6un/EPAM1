package StringAndBasicOfTextProcessing.StringToCharArray;

public class CharArray5 {
    public static void main(String[] args) {
        String input = "  c  c2   vsdf3    y4   sdfsdf  u5  ";

        System.out.println(cutSpace(input));
    }

    private static String cutSpace(String input) {
        String output = "";
        char[] chars = input.toCharArray();
        int i = 0;
        int countLastSpaces = 0;
        int j = chars.length - 1;
        if (isSpace(chars[j])) {
            while (isSpace(chars[j])) {
                countLastSpaces++;
                j--;
            }
        }
        while (i < chars.length - countLastSpaces) {
            if (i == 0 && isSpace(chars[i])) {
                i++;
            } else {
                output += chars[i];
            }
            if (isSpace(chars[i])) {
                while (isSpace(chars[i])) {
                    i++;
                }
                i--;
            }
            i++;
        }
        return output;
    }

    private static boolean isSpace(char c) {
        return c == 32;
    }
}
