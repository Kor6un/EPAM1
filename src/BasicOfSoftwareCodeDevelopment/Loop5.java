package BasicOfSoftwareCodeDevelopment;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loop5 {
    public static void main(String[] args) {

        int n;
        float e;

        System.out.println("Enter the number of members of the series n: ");
        
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        System.out.println("Enter some number e (0 < e < 1): ");
        e = scanner.nextFloat();
        scanner.close();

        List<String> series = new ArrayList<>();

        DecimalFormat decimalFormat = new DecimalFormat("#.###");

        double sum = 0;

        for (int i = 1; i <= n; i++) {
            double v = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            if (Math.abs(v) >= e) {
                sum = sum + v;
            }
            series.add(decimalFormat.format(v));
        }
        System.out.println(series);
        System.out.println(decimalFormat.format(sum));
    }
}
