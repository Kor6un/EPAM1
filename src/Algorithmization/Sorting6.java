package Algorithmization;

//сортировка Шелла

import java.util.Arrays;
import java.util.Scanner;

public class Sorting6 {
    public static void main(String[] args) {
        int size;

        System.out.print("Enter the size of array: ");
        size = getInt();

        int[] ints = getRandomIntArray(size);
      //  Arrays.sort(ints);

        System.out.println("Original array: " + Arrays.toString(ints));

        long start = System.nanoTime();
        shellSort(ints);
        long end = System.nanoTime();

        System.out.println("Changed  array: " + Arrays.toString(ints) +"\nTime: " + (end-start));
    }

    private static void shellSort(int[] ints) {
        for(int s = ints.length / 2; s > 0; s /= 2){
            for(int i = 0; i < ints.length; i++){
                for(int j = i + s; j < ints.length; j += s){
                    if(ints[i] < ints[j]){
                        int temp = ints[j];
                        ints[j] = ints[i];
                        ints[i] = temp;
                    }
                }
            }
        }
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
