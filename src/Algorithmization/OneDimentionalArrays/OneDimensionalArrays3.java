package Algorithmization.OneDimentionalArrays;

import java.util.Scanner;

public class OneDimensionalArrays3 {
    public static void main(String[] args) {

        int n;
        int negative = 0;
        int zero = 0;

        System.out.println("Enter the number of array size n: ");

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        scanner.close();

        int[] someArray = new int[n];

        for (int i = 0; i < n; i++) {

            someArray[i] = (int) (Math.random()*20)-10;

            if (someArray[i] < 0) {
                negative += 1;
            } else {
                if (someArray[i] == 0) {
                    zero += 1;
                }
            }
            System.out.println(someArray[i]);
        }

        System.out.println("Positive: " + (n - negative - zero) + "\n" +
                "negative: " + negative + "\n" +
                "zero :" + zero);
    }
}
