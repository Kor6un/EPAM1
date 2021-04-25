package Algorithmization;


import java.util.Scanner;

//сортировка выбором
public class Sorting3 {
    public static void main(String[] args) {

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
