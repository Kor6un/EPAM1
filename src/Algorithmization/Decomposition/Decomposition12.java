package Algorithmization.Decomposition;

import java.util.ArrayList;
import java.util.Scanner;
/*
        ПРИМЕР РЕШЕНИЯ

        Введите натуральное число K: 5
        Введите натуральное число N: 500
        Сумма цифр элемента массива = 5, значение элемента <= 500, количество эдементов - 21
        (5, 14, 23, 32, 41, 50, 104, 113, 122, 131, 140, 203, 212, 221, 230, 302, 311, 320, 401, 410, 500)
        Введите натуральное число K: 4
        Введите натуральное число N: 78
        Сумма цифр элемента массива = 4, значение элемента <= 78, количество эдементов - 5
        (4, 13, 22, 31, 40)
 */

public class Decomposition12 {
    public static void main(String[] args) {
        int k, n;
        System.out.print("Enter the number k: ");
        k = getInt();
        System.out.print("Enter the number n: ");
        n = getInt();

        System.out.print(getResultNumber(k, n));
    }

    private static ArrayList<Integer> getResultNumber(int k, int n) {
        ArrayList<Integer> results = new ArrayList<>();
        for (int i = 1; i <= k; i++) {
            if (sumDigits(i) == n) {
                results.add(i);
            }
        }
      return results;
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
