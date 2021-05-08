package Algorithmization.Decomposition;

public class Decomposition7 {
    public static void main(String[] args) {
        int a = 1;
        int b = 9;

        System.out.println(getSumFactorialOddElement(a, b));
    }

    private static int getSumFactorialOddElement(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (isOdd(i)) {
                sum += getFactorial(i);
            }
        }
        return sum;
    }

    private static boolean isOdd(int a) {
        return a % 2 != 0;
    }

    private static int getFactorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
