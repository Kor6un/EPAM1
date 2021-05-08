package Algorithmization.Decomposition;

import java.util.Scanner;

public class Decomposition9 {
    public static void main(String[] args) {
        double x, y, z, t;

        System.out.print("Enter the size of side x: ");
        x = getDouble();

        System.out.print("Enter the size of side y: ");
        y = getDouble();

        System.out.print("Enter the size of side z: ");
        z = getDouble();

        System.out.print("Enter the size of side t: ");
        t = getDouble();

        System.out.println("Square = " + square(x, y, z, t));
    }

    private static double square(double a, double b, double c, double d) {
        double p = ((a + b + c + d) / 2);
        return Math.sqrt((p - a) * (p - b) * (p - c) * (p - d));
    }

    private static double getDouble() {
        return new Scanner(System.in).nextDouble();
    }
}
