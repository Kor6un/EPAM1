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


    }

//TODO
    private static int oftenNumbersToArray(int[] intArray) {
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
        //!!!!!!!!!!
        int[] indexes = getIndexOfMaxNumbers(counts);

        System.out.print("\ngetMaxValueIndexes: " );
        display(indexes);

        int[] values = new int[indexes.length];
        for (int i = 0; i < indexes.length; i++) {
            values[i] = intArray[indexes[i]];
        }

        for (int i = 0; i < values.length; i++) {
           if (values.length == 1) {
               result = values[i];
           } else {
               //!!!!!!!!!!!!!!!!!
               if (values[i] < values [i + 1]) {
                   result = values[i];
               } else {
                   result = values[i + 1];
               }
               i -= 1 ;
           }
        }


        return result;
    }

    private static int[] getIndexOfMaxNumbers(int[] intArray) {


        int max = getMax(intArray);
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
       //321313132131312
        while (i <= size && j <= newSize - 1) {
            if (intArray[i] == max) {
                indexes[j] = i;
                j++;
            }
            i++;
        }
        return indexes;
    }

    private static int getMax(int[] ints) {
        int max = ints[0];
        if (ints.length > 1) {
            for (int i : ints) {
                if (i > max) {
                    max = i;
                }
            }
        }
        return max;
    }

    private static int getMin(int[] ints) {
        int min = ints[0];
        for (int i : ints) {
            if (i < min) {
                min = i;
            }
        }
        return min;
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
