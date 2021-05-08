package StringAndBasicOfTextProcessing.StringToCharArray;

public class CharArray4 {
    public static void main(String[] args) {
        String input = "UTF-8 (от англ. Unicode Transformation Format," +
                " 8-bit — «формат преобразования Юникода, 8-бит») — " +
                "распространённый стандарт кодирования символов, позволяющий " +
                "более компактно хранить и передавать символы Юникода, используя " +
                "переменное количество байт (от 1 до 4), и обеспечивающий полную " +
                "обратную совместимость с 7-битной кодировкой ASCII. Стандарт UTF-8 " +
                "официально закреплён в документах RFC 3629";
        String input1 = "1";
        String input2 = "c";
        String input3 = "15 56";
        String input4 = "sds1";

        System.out.println(getCountNumbers(input));
        System.out.println(getCountNumbers(input1));
        System.out.println(getCountNumbers(input2));
        System.out.println(getCountNumbers(input3));
        System.out.println(getCountNumbers(input4));

    }

    private static int getCountNumbers(String input) {
        char[] chars = input.toCharArray();
        int size = chars.length;
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (isDigit(chars[i])) {
                while (isDigit(chars[i]) && i != size-1) {
                    i++;
                }
                count++;
            }
        }
        return count;
    }

    private static boolean isDigit(char c) {
        return c >= 48 && c <= 57;
    }
}
