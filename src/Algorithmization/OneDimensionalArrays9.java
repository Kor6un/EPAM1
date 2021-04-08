package Algorithmization;

import java.util.Scanner;

public class OneDimensionalArrays9 {
    public static void main(String[] args) {

        int n;

        System.out.print("Enter the number of array size n: ");

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        scanner.close();

        int[] randomArray = getRandomIntArray(n);

        System.out.print("Original array: ");
        display(randomArray);

        System.out.print("\nOften number: " + oftenNumber(randomArray));
    }

    private static int oftenNumber(int[] intArray) {
        int count = 0;
        int[] counts = new int[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            for (int k : intArray) {
                if (intArray[i] == k) {
                    count += 1;
                }
            }
            counts[i] = count;
            count = 0;
        }
        int max;
        max = getMax(counts);
        int size = 0;
        for (int anInt : counts) {
            if (anInt == max) {
                size += 1;
            }
        }
        int[] indexes = new int[size];
        for (int i = 0; i < size; i++) {
            if (counts[i] == max) {
                indexes[i] = i;
            }
        }
        int min;
        min = intArray[indexes[0]];
        for (int index : indexes) {
            if (intArray[index] < min) {
                min = intArray[index];
            }
        }
        return min;
    }

    private static int getMax(int[] ints) {
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
            result[i] = (int) (Math.random() * 5);
        }
        return result;
    }
}
