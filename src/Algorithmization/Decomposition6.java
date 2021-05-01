package Algorithmization;

import java.util.ArrayList;
import java.util.Scanner;

public class Decomposition6 {
    public static void main(String[] args) {

        int a, b, c;

        System.out.print("Enter a: ");
        a = getInt();

        System.out.print("Enter b: ");
        b = getInt();

        System.out.print("Enter c: ");
        c = getInt();

        display(a, b, c);

    }

    private static void display(int a, int b, int c) {
        if (! isSimple(a, b, c)) {
            System.out.println("Numbers is not simply");
        } else {
            System.out.println("Numbers is simply");
        }
    }

    private static boolean isSimple(int a, int b, int c) {
        return nod(a, b, c) == 1;
    }

    private static int getInt() {
        return new Scanner(System.in).nextInt();
    }

    private static int nod(int a, int b, int c){
        ArrayList<Integer> dividersA = getDividers(a);
        ArrayList<Integer> dividersB = getDividers(b);
        ArrayList<Integer> dividersC = getDividers(c);

        ArrayList<Integer> totalDividers = new ArrayList<>();

        for (Integer dividerA : dividersA) {
            for (Integer dividerB : dividersB) {
                for (Integer dividerC : dividersC) {
                    if (dividerA.equals(dividerB) && dividerA.equals(dividerC)) {
                        totalDividers.add(dividerA);
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
}
