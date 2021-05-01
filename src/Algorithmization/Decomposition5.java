package Algorithmization;

import java.util.Arrays;
import java.util.Scanner;

public class Decomposition5 {
    public static void main(String[] args) {

        int n;

        System.out.print("Enter the size of array: ");
        n = getInt();

        int[] ints = randomArray(n);
        int[] ints1 = new int[] {4, 4, 4};

        System.out.println(Arrays.toString(ints));
        display(ints);

        System.out.println(Arrays.toString(ints1));
        display(ints1);
    }

    private static void display(int[] ints) {
        int penultimateElement = getPenultimateElement(ints);
        if (penultimateElement < 0) {
            System.out.println("Input error or all elements equal");
        } else {
            System.out.println("Penultimate element: " + penultimateElement);
        }
    }

    private static int getPenultimateElement(int[] ints) {
        Arrays.sort(ints);
        int result = -1;
        int max = ints[0];
        for (int i : ints) {
            if (i > max) {
                result = max;
                max = i;
            }
        }
        return result;
    }

    private static int getInt() {
        return new Scanner(System.in).nextInt();
    }

    private static int[] randomArray(int size) {
        int[] randomArray = new int[size];
        for (int i = 0; i < size; i++) {
            randomArray[i] = (int) (Math.random() * 10);
        }
        return randomArray;
    }
}
