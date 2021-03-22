package BasicOfSoftwareCodeDevelopment;

import java.util.Scanner;

public class Loop7 {
    public static void main(String[] args) {

        int m, n;

        System.out.println("Enter the segment (n, m): " );

        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        n = scanner.nextInt();
        scanner.close();

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = m; i <= n; i++) {
            for (int j = 2; j <= i; j++) {
                if ( i % j == 0 && i != j) {
                    stringBuilder.append(j).append(", ");
                }
            }
        }

        if (stringBuilder.length() == 0) {
            System.out.println(stringBuilder.append("Divider is not exist"));
        } else {
            System.out.println(stringBuilder);
        }
    }
}
