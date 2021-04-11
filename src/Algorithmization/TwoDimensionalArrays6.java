package Algorithmization;

import java.util.Scanner;

public class TwoDimensionalArrays6 {
    public static void main(String[] args) {
        int n = getEvenSize();
        display(getMatrix(n));
    }

    private static int getEvenSize() {
        int size;
        System.out.print("Enter the size of array n: ");
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();
        while (size % 2 != 0) {
            System.out.print("Enter the size of array n: ");
            size = scanner.nextInt();
        }
        scanner.close();
        return size;
    }

    private static void display(int[][] ints) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] getMatrix(int size) {
        int[][] ints = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i<=j && j+i<=size-1) || (i>=j && i+j>=size-1)) {
                    ints[i][j] = 1;
                } else {
                    ints[i][j] = 0;
                }
            }
        }
        return ints;
    }
}
