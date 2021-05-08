package Algorithmization.TwoDimentionalArrays;

import java.util.Scanner;

public class TwoDimensionalArrays10 {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the the size of array n: ");
        n = getInt();

        int[][] ints = getMatrix(n);
        System.out.println("Original matrix:");
        display(ints);

        getPositiveNumberOfMainDiagonal(ints);
    }

    private static void getPositiveNumberOfMainDiagonal(int[][] ints) {
        int flag = 0;

        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                if (i == j && isPositive(ints[i][j])) {
                    flag = 1;
                    break;
                }
            }
        }

        if (flag == 0) {
            System.out.println("Only negative numbers on main diagonal!");
        } else {
            System.out.print("Positive numbers of main diagonal: ");
            for (int i = 0; i < ints.length; i++) {
                for (int j = 0; j < ints.length; j++) {
                    if ( i == j && isPositive(ints[i][j])) {
                        System.out.print(ints[i][j] + " ");
                    }
                }
            }
        }
    }

    private static boolean isPositive(int number) {
        return number >= 0;
    }

    private static int getInt() {
        int i;
        Scanner scanner = new Scanner(System.in);
        i = scanner.nextInt();
        scanner.close();
        return i;
    }

    private static void display(int[][] ints) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[i][j] + "  ");
            }
            System.out.println();
        }
    }

    private static int[][] getMatrix(int size) {
        int[][] ints = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                ints[i][j] = (int) (Math.random() * 10 - 5);
            }
        }
        return ints;
    }
}
