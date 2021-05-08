package StringAndBasicOfTextProcessing.StringToCharArray;

public class CharArray3 {
    public static void main(String[] args) {
        String input = "JDjf lkf;654 fed54 sd5f23";
        String input1 = "1";
        String input2 = "c";
        String input3 = "1556";
        String input4 = "sds1";

        char[] chars = input.toCharArray();
        char[] chars1 = input1.toCharArray();
        char[] chars2 = input2.toCharArray();
        char[] chars3 = input3.toCharArray();
        char[] chars4 = input4.toCharArray();

        System.out.println("Count digits: " + getCountDigits(chars));
        System.out.println("Count digits1: " + getCountDigits(chars1));
        System.out.println("Count digits2: " + getCountDigits(chars2));
        System.out.println("Count digits3: " + getCountDigits(chars3));
        System.out.println("Count digits4: " + getCountDigits(chars4));
    }

    private static int getCountDigits(char[] chars) {
        int count = 0;
        for (char c : chars) {
            if (c >= 48 && c <= 57) {
                count++;
            }
        }
        return count;
    }
}
