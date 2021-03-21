package BasicOfSoftwareCodeDevelopment;

import java.util.Scanner;

public class Ramification4 {
    public static void main(String[] args) {

        float a, b, x, y, z;

        System.out.println("Enter hole parameters A, B: ");

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextFloat();
        b = scanner.nextFloat();

        System.out.println("Enter the dimensions of the brick (x, y, z): ");

        x = scanner.nextFloat();
        y = scanner.nextFloat();
        z = scanner.nextFloat();
        scanner.close();

        if (((a<x || b<y) && (b<x || a<y)) &&
                ((a<x || b<z) && (b<x || a<z)) &&
                ((a<y || b<z) && (b<y || a<z))) {
            System.out.println("not");
        } else {
            System.out.println("yes");
        }
    }
}
