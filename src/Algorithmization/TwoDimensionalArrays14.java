package Algorithmization;

import java.util.Scanner;

public class TwoDimensionalArrays14 {

    public static void main(String[] args) {
        int n,m;

        System.out.print("Enter count rows n: ");
        n = getInt();

        System.out.print("Enter count columns m: ");
        m = getInt();

        int[][] matrix = getMatrix(n, m);

        System.out.println("\nOriginal array: ");
        display(matrix);

    }

    private static void display(int[][] ints) {
        int row = ints.length;
        int column = ints[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(ints[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] getMatrix(int line, int column) {
        int[][] ints = new int[line][column];
//TODO
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < line; j++) {
                ints[j][i] = (int) (Math.random() * 2);
            }
        }

        return ints;
    }

    private static int getCount(int[][] ints, int index) {
        int count = 0;
        for (int i = 0; i < ints.length; i++) {
            count += 1;
        }
        return count;
    }

    private static int getInt(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
