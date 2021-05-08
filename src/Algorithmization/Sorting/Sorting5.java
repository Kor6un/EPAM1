package Algorithmization.Sorting;

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

    private static void sortByInserts(int[] ints) {
        for (int i = 1; i < ints.length; i++) {
            int temp = ints[i];
            int j = i - 1;
            while(j >= 0 && temp > ints[j]) {
                ints[j+1] = ints[j];
                j--;
            }
            ints[j+1] = temp;
        }
    }

    public static int binarySearch(int[] ints, int elementToSearch) {

        int firstIndex = 0;
        int lastIndex = ints.length - 1;

        // условие прекращения (элемент не представлен)
        while(firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            // если средний элемент - целевой элемент, вернуть его индекс
            if (ints[middleIndex] == elementToSearch) {
                return middleIndex;
            }

            // если средний элемент меньше
            // направляем наш индекс в middle+1, убирая первую часть из рассмотрения
            else if (ints[middleIndex] < elementToSearch)
                firstIndex = middleIndex + 1;

                // если средний элемент больше
                // направляем наш индекс в middle-1, убирая вторую часть из рассмотрения
            else if (ints[middleIndex] > elementToSearch)
                lastIndex = middleIndex - 1;

        }
        return -1;
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
