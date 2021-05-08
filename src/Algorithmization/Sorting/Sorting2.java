package Algorithmization.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting2 {
    public static void main(String[] args) {
        int size1, size2;

        System.out.print("Enter the size of first array: ");
        size1 = getInt();
        System.out.print("Enter the size of second array: ");
        size2 = getInt();

        int[] ints1 = getRandomIntArray(size1);
        int[] ints2 = getRandomIntArray(size2);

        Arrays.sort(ints1);
        Arrays.sort(ints2);

        System.out.println(Arrays.toString(ints1));
        System.out.println(Arrays.toString(ints2));

        System.out.println("With additional array: ");
        int[] result = getConcatenationArray (ints1, ints2);
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));

        System.out.println("Without additional array: ");
        getResultWithoutConcatenation(ints1, ints2);

    }

    private static void getResultWithoutConcatenation(int[] a, int[] b){
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] > b[j]) {
                    temp = a[i];
                    a[i] = b[j];
                    b[j] = temp;
                } else {
                   Arrays.sort(b);
                }
            }
        }
        System.out.print(Arrays.toString(a) + Arrays.toString(b));
    }

    private static int[] getConcatenationArray (int[] ints1, int[] ints2) {
        int size1 = ints1.length;
        int size2 = ints2.length;
        int[] result = new int[size1 + size2];
        int j = 0;
        for (int i = 0; i < size1 + size2; i++) {
            if (i < size1) {
                result[i] = ints1[i];
            } else if (j < size2){
                result[i] = ints2[j];
                j++;
            }
        }
        return result;
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
