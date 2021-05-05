package Algorithmization;

import java.util.Scanner;

public class Decomposition12 {
    public static void main(String[] args) {
        int k, n;
        System.out.print("Enter the number k: ");
        k = getInt();
        System.out.print("Enter the number n: ");
        n = getInt();
        System.out.println("sumDigits = " + sumDigits(k));
    }

    private static int getInt() {
        return new Scanner(System.in).nextInt();
    }

    private static int sumDigits(int number) {
        int sum = 0;
        while (number > 0){
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }
}
