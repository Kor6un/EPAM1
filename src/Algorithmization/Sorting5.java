package Algorithmization;

import java.util.Arrays;
import java.util.Scanner;

//сортировка вставками

public class Sorting5 {
    public static void main(String[] args) {
        int size;

        System.out.print("Enter the size of array: ");
        size = getInt();

        int[] ints = getRandomIntArray(size);
        Arrays.sort(ints);

        System.out.println("Original array: " + Arrays.toString(ints));

        long start = System.nanoTime();
        sortByInserts(ints);
        long end = System.nanoTime();

        System.out.println("Changed  array: " + Arrays.toString(ints) +"\nTime: " + (end-start));
    }

//TODO
    private static int[] sortByInserts(int[] ints) {

        return ints;
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
