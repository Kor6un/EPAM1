package BasicOfSoftwareCodeDevelopment;

import java.util.Scanner;

public class Ramification1  {
    public static void main(String[] args) {

        System.out.println("Input two angels of triangles: ");

        float a, b;

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextFloat();
        b = scanner.nextFloat();
        scanner.close();

        if ( a+b < 180) {
            System.out.println("Triangles is exist");
            if (180-a-b == 90) {
                System.out.println("Rectangle triangle");
            }
        } else {
            System.out.println("Triangles is not exist");
        }

    }
}
