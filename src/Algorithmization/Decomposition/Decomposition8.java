package Algorithmization.Decomposition;

import java.util.Arrays;

public class Decomposition8 {
    public static void main(String[] args) {

        int size = 9;
        int[] ints = randomArray(size);
        
        System.out.println(Arrays.toString(ints));

        for (int i = 0; i < ints.length-2; i += 2) {
            System.out.println(sumThree(ints, i));
        }
    }
    
    private static int sumThree(int[] ints, int index) {
        int sum = 0;
        for (int i = index; i <= index+2; i++) {
            sum += ints[i];
        }
        return sum;
    }
    
    private static int[] randomArray(int size) {
        int[] ints = new int[size];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) (Math.random() * 10);
        }
        return ints;
    }
}
