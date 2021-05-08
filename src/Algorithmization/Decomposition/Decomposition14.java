package Algorithmization.Decomposition;

import java.util.ArrayList;
import java.util.Scanner;

/*
        ПРИМЕР
        153= (1*1*1)+(5*5*5)+(3*3*3)
        370= (3*3*3)+(7*7*7)+(0*0*0)

В десятичной системе существует всего 88 чисел Армстронга. В промежутке 1 <= N <= 10
находятся следующие 32 N-значные числа Армстронга[3]:
1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54 748, 92 727, 93 084,
548 834, 1 741 725, 4 210 818, 9 800 817, 9 926 315, 24 678 050, 24 678 051, 88 593 477,
146 511 208, 472 335 975, 534 494 836, 912 985 153, 4 679 307 774.
Самое большое число Армстронга содержит 39 цифр: 115 132 219 018 764 000 000 000 000 000 000 000 000.

*/
public class Decomposition14 {
    public static void main(String[] args) {

        int k;

        System.out.print("Enter the number k: ");
        k = getInt();

        System.out.println(getArmstrongNumber(k));
    }

    private static ArrayList<Integer> getArmstrongNumber(int number) {
        ArrayList<Integer> results = new ArrayList<>();
        for (int i = 1; i < number; i++) {
            if (isArmstrongNumber(i)) {
                results.add(i);
            }
        }
        return results;
    }

    private static boolean isArmstrongNumber(int number) {
        int buf = number;
        int sum = 0;
        int power = getCountDigits(number);
        for (int i = 1; i <= buf ; i++) {
            while (buf > 0){
                sum += (int) Math.pow(buf % 10, power);
                buf = buf / 10;
            }
            if (sum == number) {
                return true;
            }
        }
        return false;
    }

    private static int getCountDigits(int number) {
        int count = 0;
        while (number > 0){
            count ++;
            number = number / 10;
        }
        return count;
    }

    private static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}
