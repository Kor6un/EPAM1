package Algorithmization;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class OneDimensionalArrays7 {
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
    }
}
