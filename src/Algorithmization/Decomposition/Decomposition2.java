package Algorithmization.Decomposition;

import java.util.ArrayList;
import java.util.Scanner;

public class Decomposition2 {
    public static void main(String[] args) {
        int a, b, c, d;

        System.out.print("Enter the number a: ");
        a = getNumber();

        System.out.print("Enter the number b: ");
        b = getNumber();

        System.out.print("Enter the number c: ");
        c = getNumber();

        System.out.print("Enter the number d: ");
        d = getNumber();

        System.out.println("NOD = " + nod(a, b ,c, d));
    }

    private static int nod(int a, int b, int c, int d) {
        ArrayList<Integer> divA = getDividers(a);
        ArrayList<Integer> divB = getDividers(b);
        ArrayList<Integer> divC = getDividers(c);
        ArrayList<Integer> divD = getDividers(d);

        ArrayList<Integer> totalDividers = new ArrayList<>();
        for (int i : divA) {
            for (int j : divB) {
                for (int k : divC) {
                    for (int l : divD) {
                        if (i == j && j == k && k == l) {
                            totalDividers.add(i);
                        }
                    }
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

    private static int getNumber() {
        return new Scanner(System.in).nextInt();
    }


}
