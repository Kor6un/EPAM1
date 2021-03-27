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
        //TODO
        for (int i = 0; i < n; i++) {
            doubles[i] = Double.parseDouble(decimalFormat.format(Math.random() * 15));
            System.out.println(i + ": " + doubles[i] + ";");
            for (int j = 1; j <= n; j++) {
                if (i+1 % j == 0 && i+1 == j) {
                    sum += doubles[i];
                }
            }
        }
        System.out.println("Sum: " + decimalFormat.format(sum));
    }
}
