package Algorithmization;

import java.util.Scanner;

public class OneDimensionalArrays8 {
    public static void main(String[] args) {

        int n;

        System.out.print ("Enter the number of array size n: ");

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        scanner.close();

        int[] ints = new int[n];

        System.out.print ("Original array: ");

        for (int i = 0; i < n; i++) {
            ints[i] = (int) (Math.random() * 3);
            System.out.print(ints[i] + " ");
        }

        int count = 0;
        int min = ints[0];

        //TODO
        for (int i = 0; i < n; i++) {
            if (ints[i] <= min) {
                min = i;
                count += 1;
            }
        }
        System.out.println("\n" + "min = " + min);
        System.out.println("count: " + count);
    }
}
