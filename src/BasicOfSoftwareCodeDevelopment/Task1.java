package BasicOfSoftwareCodeDevelopment;

/*

 Найдите значение функции: z = ((a - 3) * b / 2 + c

*/

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        double a, b, c;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a: ");
        a = scanner.nextDouble();

        System.out.print("Input b: ");
        b = scanner.nextDouble();

        System.out.print("Input c: ");
        c = scanner.nextDouble();

        scanner.close();

        System.out.println("z = " + ((a - 3) * b / 2 + c));
    }
}
