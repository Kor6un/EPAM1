package Algorithmization;

import java.util.Scanner;

public class Decomposition3 {
    public static void main(String[] args) {

        int a;

        System.out.print("Enter hexagon side size: ");
        a = getInt();

        System.out.print("Square of hexagon: " + getSquareHexagon(a));
    }

    private static int getInt() {
        return new Scanner(System.in).nextInt();
    }

    private static double getSquareEquilateralTriangle (int side) {
        return Math.sqrt(3)*Math.pow(side, 2)/4;
    }

    private static double getSquareHexagon (int side) {
        return getSquareEquilateralTriangle(side) * 6;
    }
}
