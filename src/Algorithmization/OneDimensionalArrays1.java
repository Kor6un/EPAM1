package Algorithmization;

import java.util.ArrayList;
import java.util.Scanner;

public class OneDimensionalArrays1 {
    public static void main(String[] args) {

        int n, k;

        System.out.println("Enter the number of array size n: ");

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        System.out.println("Enter some natural number K: ");

        k = scanner.nextInt();
        scanner.close();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            int randomInt = (int) ( Math.random() * 30 );
            array[i] = randomInt;
        }

        ArrayList<Integer> arrayToString = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % k == 0) {
                sum += array[i];
            }
            arrayToString.add(array[i]);
        }
        System.out.println(arrayToString + "\n" + "Sum = " + sum);
    }
}
