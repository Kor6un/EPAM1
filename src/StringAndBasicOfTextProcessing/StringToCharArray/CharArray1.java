package StringAndBasicOfTextProcessing.StringToCharArray;

import java.util.Locale;

public class CharArray1 {
    public static void main(String[] args) {
        String[] variableNames = new String[] {
                "oneVariable",
                "twoVariable",
                "threeVariable",
                "fourVariable",
                "fiveVariable",
                "sixVariable",
                "someNumberVariable"
        };
        display(variableNames);

        System.out.println();
        display(convertToSnakeCase(variableNames));
    }

    private static void display(String[] strings) {
        for (String s : strings) {
            System.out.println(s);
        }
    }

    private static String[] convertToSnakeCase(String[] inputs) {
        for (int i = 0; i < inputs.length; i++) {
            String buf = inputs[i];
            inputs[i] = toSnakeCase(buf);
        }
        return inputs;
    }

    private static String toSnakeCase(String input) {
        char[] chars = input.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : chars) {
            if (c > 65 && c < 90) {
                stringBuilder.append('_');
            }
            stringBuilder.append(c);
        }
        return String.valueOf(stringBuilder).toLowerCase(Locale.ROOT);
    }
}
