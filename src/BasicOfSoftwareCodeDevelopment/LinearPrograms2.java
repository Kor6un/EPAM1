package BasicOfSoftwareCodeDevelopment;

/*

Вычислить значение выражения по формуле
(все переменные принимают действительные значения):

 */

import java.util.Scanner;

public class LinearPrograms2 {
    public static void main(String[] args) {

        double a, b, c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a: ");
        a = scanner.nextDouble();

        System.out.println("Input b: ");
        b = scanner.nextDouble();

        System.out.println("Input c: ");
        c = scanner.nextDouble();

        scanner.close();

        if (a != 0) {
            System.out.println( (b + Math.pow(4 * a * c, 0.5) / (2 * a))
                    - Math.pow(a, 3) * c - Math.pow(b, -2) );
        } else {
            System.out.println("ERROR!!! Division by zero!");
        }
    }
}
