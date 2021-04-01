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

        System.out.println( countsNumbersOfArray(ints));

    }

    private static int countsNumbersOfArray(int[] intArray) {
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

        //TODO
        for (int i = 0; i < counts.length; i++) {
            for (int j = 1; j < counts.length - 1; j++) {
                if (counts[i] != counts [j]) {
                    result = counts[i];
                } else  if (counts[i] == counts [j] && intArray[i] < intArray[j]) {
                    result = counts[i];
                } else {
                    result = counts[j];
                }
            }
        }
        return result;
    }

    private static void display(int[] intArray) {
        int n = intArray.length;
        for (int i = 0; i < n; i++) {
            System.out.print(intArray[i] + " ");
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
