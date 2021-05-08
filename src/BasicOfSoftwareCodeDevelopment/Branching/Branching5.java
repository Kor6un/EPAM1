package BasicOfSoftwareCodeDevelopment.Branching;

import java.util.Scanner;

public class Branching5 {
    public static void main(String[] args) {

        double x;

        System.out.println("Enter x: ");

        Scanner scanner = new Scanner(System.in);
        x = scanner.nextDouble();
        scanner.close();

        if (x <= 3) {
            System.out.println(Math.pow(x, 2) - 3 * x + 9);
        } else {
            System.out.println(1/(Math.pow(x, 3) + 6));
        }
    }
}
