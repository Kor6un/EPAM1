package Algorithmization.Decomposition;

import java.util.ArrayList;
import java.util.Scanner;

public class Decomposition15 {
    public static void main(String[] args) {

        int n;

        System.out.print("Enter the count of digits in the numbers: ");
        n = getInt();

        System.out.println(increasing(n));
    }

    private static int getInt() {
        return new Scanner(System.in).nextInt();
    }

    private static ArrayList<Integer> increasing(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = (int) Math.pow(10, n - 1); i < (int) Math.pow(10, n); i++) {
           if (isIncreasing(i)) {
               result.add(i);
           }
        }
        return result;
    }

    private static boolean isIncreasing(int number) {
        int[] digits = new int[getCountDigits(number)];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = number % 10;
            number /= 10;
        }
        int count = 0;
        for (int i = 0; i < digits.length - 1; i++) {
            if (digits[i] <= digits[i + 1] ) {
                return  false;
            }
            if ( digits[i] - digits[i + 1] == 1){
                count++;
            }
        }
        return count == digits.length - 1;
    }

    private static int getCountDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number = number / 10;
        }
        return count;
    }
}
