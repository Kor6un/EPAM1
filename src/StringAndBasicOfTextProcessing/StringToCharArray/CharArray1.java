package StringAndBasicOfTextProcessing.StringToCharArray;

public class CharArray1 {
    public static void main(String[] args) {
        String[] variableNames = new String[] {
                "oneVariable",
                "twoVariable",
                "someNumberVariable",
                "SomeNumberVariable"
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
        int count = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] > 65 && chars[i] < 90 && i != 0) {
                count ++;
            }
        }

        if (count == 0) {
            return input;
        }

        char[] result = new char[chars.length + count];
        int i = 0;
        int j = 0;

        while (i < chars.length) {
            if (chars[i] > 65 && chars[i] < 90 && i != 0) {
                result[i + j] = '_';
                result[i + j + 1] = Character.toLowerCase(chars[i]);
                j++;
            } else {
                result[i + j] = Character.toLowerCase(chars[i]);
            }
            i++;
        }

        String output = "";
        int size = result.length;
        int k = 0;

        while (size > 0) {
            output += result[k];
            size--;
            k++;
        }
        return output;
    }
}
