package BasicOfSoftwareCodeDevelopment;

import java.util.*;

public class Loop8 {
    public static void main(String[] args) {

        String a, b;

        System.out.println("Enter numbers a, b: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextLine();
        b = scanner.nextLine();
        scanner.close();

        char[] num1 = a.toCharArray();
        char[] num2 = b.toCharArray();

        Set<Character> result = new HashSet<>();

        int k = 0;

        for (char c : num1) {
            for (char value : num2) {
                if (c == value) {
                    result.add(c);
                }
            }
        }
        System.out.println(result);
    }
}
