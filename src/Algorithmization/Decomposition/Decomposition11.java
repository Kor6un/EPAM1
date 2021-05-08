package Algorithmization.Decomposition;

import java.util.Scanner;

public class Decomposition11 {
    public static void main(String[] args) {
        int a, b;
        System.out.print("Enter some natural int number: ");
        a = getInt();
        System.out.print("Enter some natural int number: ");
        b = getInt();

        displaySolution(a, b);
    }

    private static void displaySolution(int a, int b) {
        int count1 = getCountDigits(a);
        int count2 = getCountDigits(b);
        if (count1 == count2) {
            System.out.print("a = b");
        } else if (count1 > count2) {
            System.out.print("a contain more digits then b");
        } else {
            System.out.print("b contain more digits then a");
        }
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
