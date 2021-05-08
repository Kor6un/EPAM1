package Algorithmization.Decomposition;

import java.util.ArrayList;
import java.util.Scanner;

public class Decomposition1 {
    public static void main(String[] args) {

        int a;
        System.out.print("Enter the first number: ");
        a = getNumber();

        int b;
        System.out.print("Enter the second number: ");
        b = getNumber();

        System.out.println("NOD = " + nod(a, b));
        System.out.println("NOK = " + nok(a, b));
    }

    private static int nod(int a, int b) {
        ArrayList<Integer> dividersA = getDividers(a);
        ArrayList<Integer> dividersB = getDividers(b);

        ArrayList<Integer> totalDividers = new ArrayList<>();
        for (Integer integer : dividersA) {
            for (Integer value : dividersB) {
                if (integer.equals(value)) {
                    totalDividers.add(integer);
                }
            }
        }
        int nod = -1;
        for (int i : totalDividers) {
            nod = i;
        }
        return nod;
    }

    private static ArrayList<Integer> getDividers(int number) {
        ArrayList<Integer> dividers = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                dividers.add(i);
            }
        }
        return dividers;
    }

    private static int nok(int a, int b){
        return a*b/nod(a,b);
    }

    private static int getNumber(){
        return new Scanner(System.in).nextInt();
    }
}
