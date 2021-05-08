package BasicOfSoftwareCodeDevelopment.LinearPrograms;

/*

 Для данное области составить  линейную программу, которая печатает true, если
 точка с координатами (x, y) принадлежит  закрашенной области, и false - в противном случае:
 -2 <= x <= 2;
 0 <= y <= 4;

 -4 <= x <= 4;
 -3 <= y <= 0;

 */

import java.util.Scanner;

public class LinearPrograms6 {
    public static void main(String[] args) {

        double x, y;

        System.out.println("Input coordinates (x,y):");

        Scanner scanner = new Scanner(System.in);
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        scanner.close();

        System.out.println(((y <= 4 && y >= 0) && (x <= 2 && x >= -2)) ||
                ((y <= 0 && y >= -3) && (x <= 4 && x >= -4)));

    }
}
