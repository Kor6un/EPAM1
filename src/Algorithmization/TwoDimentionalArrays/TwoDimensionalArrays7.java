package Algorithmization.TwoDimentionalArrays;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TwoDimensionalArrays7 {
    public static void main(String[] args) {
        int n = getSize();
        double[][] doubles = getMatrix(n);
        display(doubles);

        System.out.println("Count of negative number: " + getNegativeCount(doubles));
    }

    private static int getNegativeCount(double[][] doubles) {
        int negativeCount = 0;
        for (int i = 0; i < doubles.length; i++) {
            for (int j = 0; j < doubles.length; j++) {
                if (doubles[i][j] < 0) {
                    negativeCount +=1;
                }
            }
        }
        return negativeCount;
    }

    private static int getSize() {
        int size;
        System.out.print("Enter the size of array n: ");
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();
        scanner.close();
        return size;
    }

    private static void display(double[][] doubles) {
        DecimalFormat decimalFormat = new DecimalFormat("###.##");

        for (int i = 0; i < doubles.length; i++) {
            for (int j = 0; j < doubles.length; j++) {
                System.out.print(decimalFormat.format(doubles[i][j]) + " ");
            }
            System.out.println();
        }
    }

    private static double[][] getMatrix(int size) {
        double[][] doubles = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                doubles[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2))/size);
            }
        }
        return doubles;
    }
}
