package Algorithmization.OneDimentionalArrays;

import java.util.Scanner;

public class OneDimensionalArrays5 {
    public static void main(String[] args) {

        int n;

        System.out.println("Enter the number of array size n: ");

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        scanner.close();

        int[] intArray = new int[n];

        System.out.print("Changed array: ");

        for (int i = 0; i < n; i++) {
            intArray[i] = (int) (Math.random()*9);
            if (intArray[i] > i) {
                System.out.print (intArray[i] + " ");
            }
        }

        System.out.print("\nOriginal array: ");

        for (int i : intArray) {
            System.out.print(i + " ");
        }
    }
}
