package BasicOfSoftwareCodeDevelopment.Branching;

/*

Найти max{min(a,b), min(c,d)}

*/

import java.util.Scanner;

public class Branching2 {
    public static void main(String[] args) {
        System.out.println("Enter a, b, c, d:");

        double a, b, c, d;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        d = scanner.nextDouble();
        scanner.close();

        System.out.println(Math.max(Math.min(a, b), Math.min(c, d)));
    }
}
