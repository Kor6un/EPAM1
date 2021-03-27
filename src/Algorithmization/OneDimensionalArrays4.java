package Algorithmization;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class OneDimensionalArrays4 {
    public static void main(String[] args) {

        int n;

        System.out.println("Enter the number of array size n: ");

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        scanner.close();

        double[] doubles = new double[n];

        NumberFormat numberFormat = NumberFormat.getInstance(Locale.ENGLISH);
        DecimalFormat decimalFormat =  (DecimalFormat) numberFormat;
        String pattern = "###.##";
        decimalFormat.applyPattern(pattern);

        System.out.print("Original array: ");
        for (int i = 0; i < n; i++) {
            doubles[i] = Double.parseDouble(decimalFormat.format(Math.random() * 5));
            System.out.print((doubles[i]) + " ");
        }
        System.out.println();

        double max = doubles[0];
        double min = doubles[0];
        int indexMax = 0, indexMin = 0;

        for (int i = 0; i < n; i++) {
            if (doubles[i] > max ) {
                max = doubles[i];
                indexMax = i;
            } else {
                if (doubles[i] < min) {
                    min = doubles[i];
                    indexMin = i;
                }
            }
        }

        System.out.println("max = " + max + "\n" + "min = " + min);

        for (int i = 0; i < n; i++) {
            if (i == indexMax) {
                doubles[i] = min;
            }
            if (i == indexMin) {
                doubles[i] = max;
            }
        }

        System.out.print("Changed array: ");

        for (double d : doubles) {
            System.out.print(decimalFormat.format(d) + " ");
        }
    }
}
