package Algorithmization;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class OneDimensionalArrays2 {
    public static void main(String[] args) {

        int n;
        double z;

        System.out.println("Enter the number of array size n: ");

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        System.out.println("Enter some number Z: ");

        z = scanner.nextDouble();
        scanner.close();

        ArrayList<Double> doublesArrayList = new ArrayList<>();

        double[] array = new double[n];

        NumberFormat numberFormat = NumberFormat.getInstance(Locale.ENGLISH);
        DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
        String pattern = "###.###";
        decimalFormat.applyPattern(pattern);

        for (int i = 0; i < n; i++) {
            double randomDouble = Double.parseDouble(decimalFormat.format(Math.random() * 30));
            array[i] = randomDouble;
            doublesArrayList.add(array[i]);
        }

        System.out.println("Original array: " + doublesArrayList);

        doublesArrayList.clear();

        int count = 0;
        //TODO
        for (int i = 0; i < n; i++) {
            if (array[i] > z) {
                array[i] = z;
                count += 1;
            }
            doublesArrayList.add(array[i]);
        }
        System.out.println("Changed array: " +doublesArrayList + "\n" + "Number of replacements = " + count);
    }
}
