package BasicOfSoftwareCodeDevelopment;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
