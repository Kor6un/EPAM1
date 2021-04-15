package Algorithmization;

import java.util.Scanner;

public class TwoDimensionalArrays15 {
    public static void main(String[] args) {
        int n,m;
        System.out.print("Enter count rows n: ");
        n = getInt();

        System.out.print("Enter count columns m: ");
        m = getInt();

        int[][] matrix = getMatrix(n, m);

        System.out.println("\nOriginal matrix: ");
        display(matrix);

        System.out.print("Max: " + getMax(matrix));

        System.out.println("\nChanged matrix: ");
        display(changedMatrix(matrix));
    }

    private static void display(int[][] ints) {
        int row = ints.length;
        int column = ints[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (ints[i][j] <10) {
                    System.out.print(ints[i][j] + "   ");
                } else {
                    System.out.print(ints[i][j] + "  ");
                }
            }
            System.out.println();
        }
    }

    private static int[][] getMatrix(int line, int column) {
        int[][] ints = new int[line][column];
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < line; j++) {
                ints[j][i] = (int) (Math.random() * 50);
            }
        }
        return ints;
    }

    private static int getInt(){
        return new Scanner(System.in).nextInt();
    }

    private static int getMax(int[][] ints) {
        int rows = ints.length;
        int columns = ints[0].length;
        int max = ints[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (ints[i][j] > max) {
                    max = ints[i][j];
                }
            }
        }
        return max;
    }

    private static int[][] changedMatrix(int[][] ints) {
        int rows = ints.length;
        int columns = ints[0].length;
        int max = getMax(ints);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (ints[i][j] % 2 == 0 && ints[i][j] != 0) {
                    ints[i][j] = max;
                }
            }
        }
        return ints;
    }
}
