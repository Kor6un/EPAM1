package Algorithmization;

import java.util.Scanner;

public class TwoDimensionalArrays16 {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the dimension of square: ");
        n = getInt();
        System.out.println("Magic square:");
        display(getOddMagicSquare(n));
    }

    private static void display(int[][] ints) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[0].length; j++) {
                System.out.print(ints[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] getOddMagicSquare(int size) {
        int[][] magicSquare = new int[size][size];

        int number = 1;
        int row = 0;
        int column = size / 2;
        int curr_row;
        int curr_col;
        while (number <= size * size) {
            magicSquare[row][column] = number;
            number++;
            curr_row = row;
            curr_col = column;
            row -= 1;
            column += 1;
            if (row == -1) {
                row = size - 1;
            }
            if (column == size) {
                column = 0;
            }
            if (magicSquare[row][column] != 0) {
                row = curr_row + 1;
                column = curr_col;
                if (row == -1) {
                    row = size - 1;
                }
            }
        }
        return magicSquare;
    }

    private static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}
