package Algorithmization.Decomposition;

import java.util.Scanner;

public class Decomposition17 {
    public static void main(String[] args) {

        int n;

        System.out.print("Some natural number: ");
        n = getInt();

        System.out.println("Count iterations: "  + getCountIterations(n));
    }

    private static int getCountIterations(int number) {
        int count = 0;
        int i = 1;
        while (number > 0) {
            number = getSumDigits(number);
            System.out.println("Sum " + i + " = " + number);
            count++;
            i++;
            if (number <= 9) {
                break;
            }
        }
        return count;
    }

    private static int getSumDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    private static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}
