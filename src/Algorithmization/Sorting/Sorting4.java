package Algorithmization.Sorting;

import java.util.Arrays;
import java.util.Scanner;

//сортировка обменами (пузырьком)

public class Sorting4 {
    public static void main(String[] args) {
        int size;

        System.out.print("Enter the size of array: ");
        size = getInt();

        int[] ints = getRandomIntArray(size);
        Arrays.sort(ints);

        System.out.println("Original array: " + Arrays.toString(ints));

        long start = System.nanoTime();
        sortingExchanges(ints);
        long end = System.nanoTime();

        System.out.println("Changed  array: " + Arrays.toString(ints) +"\nTime: " + (end-start));
    }

    private static void sortingExchanges(int[] ints) {
        int count = 0;
        int temp;
        boolean isSorted = false;
        while (! isSorted) {
            isSorted = true;
            for (int j = 0; j < ints.length-1; j++) {
                if (ints[j] < ints[j+1]) {
                    isSorted = false;
                    temp = ints[j];
                    ints[j] = ints[j+1];
                    ints[j+1] = temp;
                    count ++;
                }
            }
        }
        System.out.println("Count of exchanges: " + count);
    }

    private static int[] getRandomIntArray(int size) {
        int[] randomIntArray = new int[size];
        for (int i = 0; i < size; i++) {
            randomIntArray[i] = (int) (Math.random()*10);
        }
        return randomIntArray;
    }

    private static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}
