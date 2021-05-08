package Algorithmization.TwoDimentionalArrays;

import java.util.Scanner;

public class TwoDimensionalArrays8 {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the the size of array n: ");
        n = getInt();

        int k;
        System.out.print("Enter the the line of array k: ");
        k = getInt();

        int l;
        System.out.print("Enter the the column of array l: ");
        l = getInt();

        System.out.println("i: " + k + "\nj: " + l);

        int[][] ints = getMatrix(n);
        System.out.println("Original matrix:");
        display(ints);

        int[][] changedMatrix = changeMatrix(ints, k, l);
        System.out.println("Changed matrix:");
        display(changedMatrix);
    }

    private static int[][] changeMatrix(int[][] ints, int k, int l) {

        int[] column = new int[ints.length];
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                if (k == j+1) {
                    column[i] = ints[i][k-1];
                    ints[i][k-1] = ints[i][l-1];
                    ints[i][l-1] = column[i];
                }
            }
        }
        return ints;
    }

    private static int getInt() {
        int i;
        Scanner scanner = new Scanner(System.in);
        i = scanner.nextInt();
       // scanner.close();
        return i;
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
                ints[i][j] = (int) (Math.random() * 10);
            }
        }
        return ints;
    }
}
