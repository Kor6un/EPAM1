package Algorithmization;

import java.util.Scanner;

public class Decomposition9 {
    public static void main(String[] args) {
        int x, y, z, t;

        System.out.print("Enter the size of side x: ");
        x = getInt();

        System.out.print("Enter the size of side y: ");
        y = getInt();

        System.out.print("Enter the size of side z: ");
        z = getInt();

        System.out.print("Enter the size of side t: ");
        t = getInt();

        System.out.println("Square = " + square(x, y, z, t));
    }

    private static double square(int a, int b, int c, int d) {
        int p = (a + b + c + d) / 2;
        return Math.sqrt((p - a) * (p - b) * (p - c) * (p - d));
    }

    private static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}
