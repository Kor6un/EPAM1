package Algorithmization;

import java.util.ArrayList;
import java.util.Scanner;

public class Decomposition16 {
    public static void main(String[] args) {

        int n;

        System.out.print("Enter the count of digits in the numbers: ");
        n = getInt();

        ArrayList<Integer> oddNumbers = getOddNumbers(n);
        int sumOdd = getSumOddNumbers(oddNumbers);

        System.out.println("Odd numbers: " + oddNumbers);
        System.out.println("Sum all odd numbers: " + sumOdd);
        System.out.println("Count even digits in sum: " + getCountEvenDigits(sumOdd));
    }

    private static int getCountEvenDigits(int number) {
        int count = 0;
        while (number > 0) {
            int digit = number % 10;
            if (isEven(digit) && digit != 0) {
                count++;
            }
            number /= 10;
        }
        return count;
    }

    private static ArrayList<Integer> getOddNumbers(int n) {
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for (int i = (int) Math.pow(10, n - 1); i < (int) Math.pow(10, n) ; i++) {
            if (isOddAllDigits(i)) {
                oddNumbers.add(i);
            }
        }
        return oddNumbers;
    }

    private static boolean isOddAllDigits(int number) {
        while (number > 0) {
            if (isEven(number % 10)) {
                return false;
            }
            number /= 10;
        }
        return true;
    }

    private static int getSumOddNumbers(ArrayList<Integer> oddNumbers) {
        int sum = 0;
        for (int i : oddNumbers) {
            sum += i;
        }
        return sum;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}
