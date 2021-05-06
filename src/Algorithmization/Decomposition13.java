package Algorithmization;

import java.util.Scanner;

public class Decomposition13 {
    public static void main(String[] args) {

        int n;

        System.out.print("Enter the number n (n > 2): ");
        n = getInt();

        getTwins(n);
    }

    private static void getTwins(int n) {
        if (n >= 2) {
            for (int i = n; i <= 2*n - 2 ; i++) {
                System.out.println("Twins " + (i-n+1) + ": " + i + "; " + (i + 2));
            }
        } else {
            System.out.println("Input error! n < 2");
        }
    }

    private static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}
