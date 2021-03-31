package Algorithmization;

import java.util.Scanner;

public class OneDimensionalArrays8 {
    public static void main(String[] args) {

        int n;

        System.out.print ("Enter the number of array size n: ");

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        scanner.close();

        int[] ints = new int[n];

        System.out.print ("Original array: ");

        for (int i = 0; i < n; i++) {
            ints[i] = (int) (Math.random() * 10);
            System.out.print(ints[i] + " ");
        }

        int min = getMin(ints);
        int count = getNumberCount(ints, min);

        int[] changedInts = new int[n - count];

        //TODO
       while (n - 1 > 0) {
           if (ints[n - 1] != min) {
               changedInts[count - 1] = ints[n - 1];
           }
          n --;
       }

        System.out.println("\n" + "min = " + min);
        System.out.println("count: " + count);
        System.out.print ("Changed array: ");

        for (int i : changedInts) {
            System.out.print(i + " ");
        }
    }

    private static int getMin(int[] ints) {
        int min = ints[0];
        for (int anInt : ints) {
            if (anInt < min) {
                min = anInt;
            }
        }
        return min;
    }

    private static int getNumberCount(int[] ints, int number) {
        int count = 0;
        for (int anInt : ints) {
            if (anInt == number) {
                count += 1;
            }
        }
        return count;
    }
}
