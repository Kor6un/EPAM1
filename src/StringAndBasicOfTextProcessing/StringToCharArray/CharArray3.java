package StringAndBasicOfTextProcessing.StringToCharArray;

public class CharArray3 {
    public static void main(String[] args) {
        String input = "JDjf lkf;654 fed54 sd5f23";
        String input1 = "1";
        String input2 = "c";
        String input3 = "1556";
        String input4 = "sds1";

        System.out.println("Count digits: " + getCountDigits(input));
        System.out.println("Count digits1: " + getCountDigits(input1));
        System.out.println("Count digits2: " + getCountDigits(input2));
        System.out.println("Count digits3: " + getCountDigits(input3));
        System.out.println("Count digits4: " + getCountDigits(input4));
    }

    private static int getCountDigits(String s) {
        char[] chars = s.toCharArray();
        int count = 0;
        for (char c : chars) {
            if (c >= 48 && c <= 57) {
                count++;
            }
        }
        return count;
    }
}
