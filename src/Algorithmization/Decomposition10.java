package Algorithmization;

import java.util.Scanner;

public class Decomposition10 {
    public static void main(String[] args) {

        int n;

        System.out.print("Enter some natural int number: ");
        n = getInt();

        System.out.print("Count digits: " + getCountDigits(n));
    }

    private static int getCountDigits(int n) {
        int count = 0;
        while (n > 0){
            if (isDigit(n % 10)) {
                count++;
                n = n / 10;
            }
        }
        return count;
    }

    private static int getInt() {
        return new Scanner(System.in).nextInt();
    }

    private static boolean isDigit(int digit) {
        boolean result = false;
        for (int i = 0; i <= 9; i++) {
            if (Integer.valueOf(digit).equals(i)) {
                result = true;
                break;
            }
        }
       return result;
    }
}
