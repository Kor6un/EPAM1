package BasicOfSoftwareCodeDevelopment;

import java.util.Scanner;

public class Cycles1 {
    public static void main(String[] args) {
        int a, result = 0;
        System.out.println("Enter some natural number x: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= a; i++) {
            result = result + i;
        }
        System.out.println(result);
    }
}
