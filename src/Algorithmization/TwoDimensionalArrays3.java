package Algorithmization;

import java.util.Scanner;

public class TwoDimensionalArrays3 {
    public static void main(String[] args) {

        int n, k, p;

        System.out.print("Enter the size of array n: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.print("Enter the number of line k: ");
        k = scanner.nextInt();
        System.out.print("Enter the number of column p: ");
        p = scanner.nextInt();
        scanner.close();

        int[][] ints = getRandomMatrix(n);

        System.out.println("Original matrix: ");
        display(ints);

        System.out.println("Changed matrix: ");
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                if ((i + 1) == k || (j + 1) == p) {
                    System.out.print(ints[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private static void display(int[][] ints) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] getRandomMatrix(int size) {
        int[][] ints = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                ints[i][j] = (int) (Math.random()* 10);
            }
        }
        return ints;
    }
}
