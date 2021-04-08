package Algorithmization;

import java.util.Scanner;

public class OneDimensionalArrays10 {
    public static void main(String[] args) {
        int n;

        System.out.print("Enter the number of array size n: ");

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        scanner.close();

        int[] randomArray = getRandomIntArray(n);

        System.out.print("Original array: ");
        display(randomArray);

        for (int i = 0; i < randomArray.length; i++) {
            if ((i+1)%2 == 0) {
                randomArray[i] = 0;
            }
        }
        System.out.print("\nChanged array: ");
        display(randomArray);
    }

    private static int[] getRandomIntArray(int size) {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = (int) (Math.random() * 10);
        }
        return result;
    }

    private static void display(int[] intArray) {
        for (int j : intArray) {
            System.out.print(j + " ");
        }
    }
}
