package Algorithmization;

import java.util.Scanner;

public class OneDimensionalArrays9 {
    public static void main(String[] args) {

        System.out.print("Enter the size of array n: ");

        int n;

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        scanner.close();

        int[] ints = getRandomIntArray(n);

        System.out.print("Original array: ");

        display(ints);

        System.out.println("\nMax = " + findIntMax(ints));

       // System.out.println("\nMax = " + countsNumbersToArray(ints));

        System.out.println("Indexes: ");
        display(getMaxCountIndexes(ints));
    }
//TODO
    private static int countsNumbersToArray(int[] intArray) {
        int result = 0;
        int countSingleNumber = 0;
        int[] counts = new int[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            for (int k : intArray) {
                if (intArray[i] == k) {
                    countSingleNumber += 1;
                }
            }
            counts[i] = countSingleNumber;
            countSingleNumber = 0;
        }

        int maxCount = findIntMax(intArray);
        int[] maxCountIndexes = getMaxCountIndexes(intArray);

        return result;
    }
//TODO
    private static int[] getMaxCountIndexes(int[] intArray) {
        int max = findIntMax(intArray);
        int i = 0;
        int size = intArray.length;
        while (i <= size) {
            if (intArray[i] == max) {
                size -= 1;
            }
            i++;
        }

        int newSize = intArray.length - size;
        int[] indexes = new int[newSize];

        i = 0;
        size = intArray.length;
        int j = 0;
        while (i <= size && j <= newSize-1) {
            if (intArray[i] == max) {
                indexes[j] = i;
                j++;
            }
            i++;
        }
        return indexes;
    }
//TODO
    private static int findIntMax(int[] ints) {
        int max = ints[0];
        for (int i : ints) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    private static void display(int[] intArray) {
        for (int j : intArray) {
            System.out.print(j + " ");
        }
    }

    private static int[] getRandomIntArray(int size) {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = (int) (Math.random() * 10);
        }
        return result;
    }
}
