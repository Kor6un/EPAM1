package BasicOfSoftwareCodeDevelopment.Branching;

import java.util.Scanner;

public class Branching1 {
    public static void main(String[] args) {

        System.out.println("Input two angles of triangle: ");

        float a, b;

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextFloat();
        b = scanner.nextFloat();
        scanner.close();

        if ( a+b < 180) {
            System.out.println("Triangle is exist");
            if (180-a-b == 90 || a == 90 || b == 90) {
                System.out.println("Rectangle triangle");
            }
        } else {
            System.out.println("Triangle is not exist");
        }

    }
}
