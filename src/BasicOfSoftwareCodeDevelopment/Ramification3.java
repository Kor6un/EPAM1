package BasicOfSoftwareCodeDevelopment;

import java.util.Scanner;

public class Ramification3 {
    public static void main(String[] args) {

        double x1, y1, x2, y2, x3, y3;

        System.out.println("Enter position point A: ");
        Scanner scanner = new Scanner(System.in);
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();

        System.out.println("Enter position point B: ");
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();

        System.out.println("Enter position point C: ");
        x3 = scanner.nextDouble();
        y3 = scanner.nextDouble();
        scanner.close();

        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
            System.out.println("Points are collinear");
        } else {
            System.out.println("Points are not collinear");
        }
    }
}
