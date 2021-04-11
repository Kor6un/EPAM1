package Algorithmization;

import java.util.Scanner;

public class TwoDimensionalArrays9 {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the the size of array n: ");
        n = getInt();

        int[][] ints = getMatrix(n);
        System.out.println("Original matrix:");
        display(ints);

        int[] sums = getColumnSum(ints);
        System.out.print("Sums: ");
        display(sums);

        System.out.print("\nNumber column with max sum: ");
        System.out.println(getNumberOfColumn(sums));
    }

    private static int getNumberOfColumn(int[] sums) {
        int columnNumber = 0;
        int max = sums[0];
        for (int i = 0; i < sums.length; i++) {
            if (sums[i] > max) {
                max = sums[i];
                columnNumber = i+1;
            }
        }

        return columnNumber;
    }

    private static int[] getColumnSum(int[][] ints){
        int sum = 0;
        int[] sums = new int[ints.length];
        for (int j = 0; j < ints.length; j++) {
            for (int i = 0; i < ints.length; i++) {
                sum += ints[i][j];
            }
            sums[j] = sum;
            sum = 0;
        }
        return sums;
    };

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
                System.out.print(ints[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void display(int[] ints) {
        for (int anInt : ints) {
            System.out.print(anInt + " ");
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
