package Algorithmization.Sorting;

import java.util.Arrays;
import java.util.Scanner;

//сортировка выбором

public class Sorting3 {
    public static void main(String[] args) {
        int size;

        System.out.print("Enter the size of array: ");
        size = getInt();

        int[] ints = getRandomIntArray(size);
        Arrays.sort(ints);

        System.out.println("Original array: " + Arrays.toString(ints));

        long start = System.nanoTime();
        selectionSort(ints);
        long end = System.nanoTime();

        System.out.println("Changed  array: " + Arrays.toString(ints) +"\nTime: " + (end-start));
    }

    private static void selectionSort(int[] ints) {
        int size = ints.length;
        int temp;
        for (int i = 0; i < size; i++) {
            int index = i;
            int max = ints[i];
            for (int j = i; j < size; j++) {
                if (ints[j] > max) {
                    max = ints[j];
                    index = j;
                }
            }
            temp = ints[i];
            ints[i] = max;
            ints[index] = temp;
            size--;
        }
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
