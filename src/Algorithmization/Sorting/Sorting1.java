package Algorithmization.Sorting;

import java.util.Scanner;

public class Sorting1 {
    public static void main(String[] args) {
        int n, m, k;
        System.out.print("Enter the size of first array: ");
        n = getInt();
        System.out.print("Enter the size of second array: ");
        m = getInt();
        System.out.print("Enter the index for input: ");
        k = getInt();
        if (k < n) {
            int[] array1 = getRandomIntArray(n);
            display(array1);
            System.out.println();
            int[] array2 = getRandomIntArray(m);
            display(array2);
            int[] array3 = new int[n + m];
            int i = 0;
            int j = 0;
            int l = 0;
            while (i < n + m){
                if (i + 1 <= k){
                    array3[i] = array1[i];
                } else {
                    while (j < m){
                        array3[i] = array2[j];
                        i++;
                        j++;
                    }
                    array3[i] = array1[l];
                }
                i++;
                l++;
            }

            System.out.println();
            display(array3);
        } else {
            System.out.println("Incorrect index for input");
        }


    }

    private static void display(int[] array){
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
    private static int[] getRandomIntArray(int size) {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = (int) (Math.random()*10);
        }
        return result;
    }

    private static int getInt(){
        return new Scanner(System.in).nextInt();
    }
}
