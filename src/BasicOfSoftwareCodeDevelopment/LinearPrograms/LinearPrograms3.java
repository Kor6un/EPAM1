package BasicOfSoftwareCodeDevelopment.LinearPrograms;

/*

Вычислить значение выражения по формуле
(все переменные принимают действительные значения):

 */

import java.util.Scanner;

public class LinearPrograms3 {
    public static void main(String[] args) {
        double x, y;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input x: ");
        x = scanner.nextDouble();

        System.out.println("Input y: ");
        y = scanner.nextDouble();

        scanner.close();

        double v = Math.cos(x) - Math.sin(y);
        if ( v != 0) {
            System.out.println("Result: " + ((Math.sin(x) + Math.cos(y)) * Math.tan(x * y)) / (v));
        } else {
            System.out.println("ERROR! Division by zero!");
        }
    }
}
