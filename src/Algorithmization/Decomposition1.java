package Algorithmization;

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
        ArrayList<Integer> dividersA = new ArrayList<>();
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                dividersA.add(i);
            }
        }
        ArrayList<Integer> dividersB = new ArrayList<>();
        for (int i = 1; i <= b; i++) {
            if (b % i == 0) {
                dividersB.add(i);
            }
        }
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

    private static int nok(int a, int b){
        return a*b/nod(a,b);
    }

    private static int getNumber(){
        return new Scanner(System.in).nextInt();
    }
}
