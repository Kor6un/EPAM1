package Algorithmization;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class OneDimensionalArrays6 {
    public static void main(String[] args) {

        int n;
        double sum = 0;

        System.out.println("Enter the number of array size n: ");

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        scanner.close();

        double[] doubles = new double[n];

        NumberFormat numberFormat = NumberFormat.getInstance(Locale.ENGLISH);
        DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
        String pattern = "###.##";
        decimalFormat.applyPattern(pattern);

        System.out.println("Original array (index: value): ");

        for (int i = 0; i < n; i++) {
            doubles[i] = Double.parseDouble(decimalFormat.format(Math.random() * 15));
            System.out.println((i + 1) + ": " + doubles[i] + "; ");
            if (checkSimple(i + 1)) {
                sum += doubles[i];
                System.out.println ("Simple (" + (i + 1) + ") : " + doubles[i] + " ");
            }
        }
        System.out.println("Sum: " + decimalFormat.format(sum));
    }

    public static boolean checkSimple(int i) {
        if (i <= 1) {
            return false;
        } else {
            if (i <= 3) {
                return true;
            } else {
                if (i % 2 == 0 || i % 3 == 0) {
                    return false;
                }
            }
        }

        int n = 5;

        while (n * n <= i) {
            if (i % n == 0 || i % (n + 2) == 0)
                return false;
            n = n + 6;
        }
        return true;
    }
}
