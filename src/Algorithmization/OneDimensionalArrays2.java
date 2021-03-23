package Algorithmization;

import java.util.ArrayList;
import java.util.Scanner;

public class OneDimensionalArrays2 {
    public static void main(String[] args) {
        int n, z;

        System.out.println("Enter the number of array size n: ");

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        System.out.println("Enter some number Z: ");

        z = scanner.nextInt();
        scanner.close();

        ArrayList<Integer> arrayToString = new ArrayList<>();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            int randomInt = (int) ( Math.random() * 30 );
            array[i] = randomInt;
            arrayToString.add(array[i]);
        }

        System.out.println("Original array: " + arrayToString);

        arrayToString.clear();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] > z) {
                array[i] = z;
                count += 1;
            }
            arrayToString.add(array[i]);
        }
        System.out.println(arrayToString + "\n" + "Number of replacements = " + count);
    }
}
